package oddeven;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * コントローラークラス
 * @author Kiichi
 */
public class FXMLDocumentController implements Initializable {
    
    // @FXMLのアノテーションを付けることで.fxml上のコントロールと紐付ける。
    @FXML
    private Label lbl_Result;           // 出力結果を表示するラベル
    @FXML
    private TextArea txb_Input;     // 入力値を入れるテキストエリア
    
    // .fxmlに紐付くメソッドもアノテーション付ける。
    // 下のはbtn_Checkを押した時("OnAction"イベント発生時)に呼び出されるメソッド。
    @FXML
    private void Odd_Even(ActionEvent event){   
        
        // 入力された値をint型で格納。
        int num = Integer.parseInt(txb_Input.getText());

        // 奇数偶数の判定を行い、ラベルテキストへセットする。
        if(num % 2 == 0){
            lbl_Result.setText("偶数です。");
        }else{
            lbl_Result.setText("奇数です。");
        }
        // ガバガバな処理許してください。
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // インスタンス生成時に呼び出されるコントローラー初期化用のメソッド。
    }    
    
}
