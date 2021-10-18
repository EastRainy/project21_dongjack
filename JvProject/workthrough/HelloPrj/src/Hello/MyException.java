package Hello;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Hashtable;

//============================================================================
//����� ���� ���� Ŭ����
//============================================================================
public class MyException
{
        //============================================================================
        //���� ���� ����
        //============================================================================
        public enum RUN_MODE { DEBUG, RELEASE }                 //DEBUG:����/RELEASE:���� ������

        //(���ο� ���� �ڵ带 ���⿡ ���...)
        private static final Long SAMPLE_ERROR_CODE = 0L;
        private static final Long ERROR_DIVIDE_BY_ZERO = 466002798L;
        //���� �޽��� ����
        private static Hashtable<Long, String> ErrTable = new Hashtable<Long, String>();
        private static RUN_MODE RunMode = RUN_MODE.DEBUG;       //���� ��� ����
        //============================================================================
        //���� �Լ� ����
        //============================================================================
        //------------------------------------------------------------
        // ���� �޽��� �ʱ�ȭ
        //------------------------------------------------------------
        // RunMode : ����
        //------------------------------------------------------------
        public static void InitErrorInfo(RUN_MODE RunMode)
        {
                MyException.RunMode = RunMode;

                //(���ο� ���� �޽����� ���⿡ ���...)
                MyException.ErrTable.put(MyException.SAMPLE_ERROR_CODE, "���� ���� �޽��� �Դϴ�.");
                MyException.ErrTable.put(MyException.ERROR_DIVIDE_BY_ZERO, "��� ������ �߻� �Ͽ����ϴ�.");
        }
        //------------------------------------------------------------
        // ���� �޽��� ���
        //------------------------------------------------------------
        // ex : ���� ��ü
        //------------------------------------------------------------
        public static void DisplayErrMsg(Exception ex)
        {
                String msg = null;
                String UserMsg = null;

                if (MyException.ErrTable.containsKey(Long.parseLong(String.valueOf(ex.hashCode()))) == true)
                {
                        UserMsg = MyException.ErrTable.get(Long.parseLong(String.valueOf(ex.hashCode()))).toString();
                }
                else
                {
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        
                        StringSelection contents = new StringSelection(String.valueOf(ex.hashCode()));
                        clipboard.setContents(contents, null);

                        UserMsg = "Ŭ�����忡 ���� �ڵ带 ���� �߽��ϴ�.\n" +
                                          "\t\t�����ڵ�� �޽����� ��� �ϼ���.\n" +
                                          "\t\t[�����ڵ�:" + String.valueOf(ex.hashCode()) + "]";
                }

                //�����ڿ� �޽���
                if (MyException.RunMode == RUN_MODE.DEBUG)
                {
                        msg = MessageFormat.format("[hashCode]\t{0, number, #}\n" +
                                                                           "[Dev-Message]\t{1}\n" +
                                                                           "[User-Message]\t{2}\n" +
                                                                           "[Source]\t{3}\n" +
                                                                           "[Exception]\t{4}",
                                                                           ex.hashCode(),
                                                                           ex.getMessage(),
                                                                           UserMsg,
                                                                           Arrays.toString(ex.getStackTrace()),
                                                                           ex.fillInStackTrace().toString());
                }
                //����ڿ� �޽���
                else
                {
                        msg = UserMsg;
                }

                System.out.println();
                System.out.println("=============================================================");
                System.out.println("                          Exception                          ");
                System.out.println("-------------------------------------------------------------");
                System.out.println(msg);
                System.out.println("=============================================================");
        }
}
//============================================================================
//END
//============================================================================
