package config.buiders;

public class LoginCredsBuilder {
        private String username;
        private String password;

        private LoginCredsBuilder() {
            this.username = System.getProperty("username");
            this.password = System.getProperty("password");
        }

        public static LoginCredsBuilder fromSystemProperties() {
            return new LoginCredsBuilder();
        }

        public LoginCreds build() {
            return new LoginCreds(username, password);
        }
    }