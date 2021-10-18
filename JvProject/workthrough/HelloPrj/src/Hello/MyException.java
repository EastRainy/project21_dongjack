package Hello;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Hashtable;

//============================================================================
//사용자 정의 예외 클래스
//============================================================================
public class MyException
{
        //============================================================================
        //전역 변수 선언
        //============================================================================
        public enum RUN_MODE { DEBUG, RELEASE }                 //DEBUG:개발/RELEASE:배포 모드관리

        //(새로운 예외 코드를 여기에 등록...)
        private static final Long SAMPLE_ERROR_CODE = 0L;
        private static final Long ERROR_DIVIDE_BY_ZERO = 466002798L;
        //에러 메시지 관리
        private static Hashtable<Long, String> ErrTable = new Hashtable<Long, String>();
        private static RUN_MODE RunMode = RUN_MODE.DEBUG;       //개발 모드 관리
        //============================================================================
        //공용 함수 선언
        //============================================================================
        //------------------------------------------------------------
        // 에러 메시지 초기화
        //------------------------------------------------------------
        // RunMode : 운영모드
        //------------------------------------------------------------
        public static void InitErrorInfo(RUN_MODE RunMode)
        {
                MyException.RunMode = RunMode;

                //(새로운 예외 메시지를 여기에 등록...)
                MyException.ErrTable.put(MyException.SAMPLE_ERROR_CODE, "에러 샘플 메시지 입니다.");
                MyException.ErrTable.put(MyException.ERROR_DIVIDE_BY_ZERO, "계산 오류가 발생 하였습니다.");
        }
        //------------------------------------------------------------
        // 에러 메시지 출력
        //------------------------------------------------------------
        // ex : 예외 객체
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

                        UserMsg = "클립보드에 에러 코드를 복사 했습니다.\n" +
                                          "\t\t예외코드와 메시지를 등록 하세요.\n" +
                                          "\t\t[예외코드:" + String.valueOf(ex.hashCode()) + "]";
                }

                //개발자용 메시지
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
                //사용자용 메시지
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
