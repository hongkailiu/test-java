package tk.hongkailiu.test.app.lombok;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

import java.util.Set;

public class JsonInput {
    @Getter private Set<NpcUpdate> npcUpdates;

    public static JsonInput parse(String jsonString){
        return new Gson().fromJson(jsonString, JsonInput.class);
    }

    @Data class NpcUpdate {
        @SerializedName("_comment_")
        private String commit;
        @SerializedName("TR_LIST")
        private String trList;
        private Set<Product> products;
    }
}
