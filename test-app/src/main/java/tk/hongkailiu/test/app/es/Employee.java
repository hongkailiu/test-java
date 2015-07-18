package tk.hongkailiu.test.app.es;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by hongkailiu on 2015-07-18.
 */
@Data public class Employee {
    @SerializedName("first_name")
    private String firstname;
    @SerializedName("last_name")
    private String lastname;
    private int age;
    private String about;
    private String[] interests;

    public String toJson(){
        return new Gson().toJson(this);

    }
}
