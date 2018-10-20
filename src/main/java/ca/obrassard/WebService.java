package ca.obrassard;

import ca.obrassard.jooqentities.tables.Users;
import ca.obrassard.jooqentities.tables.records.UsersRecord;

import org.jooq.DSLContext;
import org.jooq.Result;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olivier Brassard.
 * Project : inquirioServer
 * Filename : InquirioWebService.java
 * Date: 19-10-18
 */

@Path("/")
public class WebService {

    private DSLContext context;

    public WebService() throws SQLException {
        this.context = DatasourceConfig.getContext();
    }

    @GET
    public String getVersion(){
        return " API v1.0 - All systems operational";
    }

//    @GET @Path("users")
//    public List<User> getUsers(){
//        Result<UsersRecord> result = context.selectFrom(Users.USERS).fetch();
//
//        List<User> users = new ArrayList<>();
//
//        for (UsersRecord r: result){
//            users.add(new User(r));
//        }
//        return users;
//    }
}
