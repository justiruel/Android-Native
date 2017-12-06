package irul.com.android_retrofit2.service;

import java.util.List;
import irul.com.android_retrofit2.model.GitHubRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by irul on 12/6/2017.
 */

public interface GitHubClient {
    //@GET("/users/{user}/repos")
    @GET("/users/justiruel/repos")
    Call<List<GitHubRepo>> reposForUser(
            //@Path("user") String user
    );
}
