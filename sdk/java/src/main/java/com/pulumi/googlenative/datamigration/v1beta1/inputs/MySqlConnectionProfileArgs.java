// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration.v1beta1.inputs.SslConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies connection parameters required specifically for MySQL databases.
 * 
 */
public final class MySqlConnectionProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final MySqlConnectionProfileArgs Empty = new MySqlConnectionProfileArgs();

    /**
     * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
     */
    @Import(name="cloudSqlId")
    private @Nullable Output<String> cloudSqlId;

    /**
     * @return If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
     */
    public Optional<Output<String>> cloudSqlId() {
        return Optional.ofNullable(this.cloudSqlId);
    }

    /**
     * The IP or hostname of the source MySQL database.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The IP or hostname of the source MySQL database.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The network port of the source MySQL database.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The network port of the source MySQL database.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * SSL configuration for the destination to connect to the source database.
     * 
     */
    @Import(name="ssl")
    private @Nullable Output<SslConfigArgs> ssl;

    /**
     * @return SSL configuration for the destination to connect to the source database.
     * 
     */
    public Optional<Output<SslConfigArgs>> ssl() {
        return Optional.ofNullable(this.ssl);
    }

    /**
     * The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private MySqlConnectionProfileArgs() {}

    private MySqlConnectionProfileArgs(MySqlConnectionProfileArgs $) {
        this.cloudSqlId = $.cloudSqlId;
        this.host = $.host;
        this.password = $.password;
        this.port = $.port;
        this.ssl = $.ssl;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MySqlConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MySqlConnectionProfileArgs $;

        public Builder() {
            $ = new MySqlConnectionProfileArgs();
        }

        public Builder(MySqlConnectionProfileArgs defaults) {
            $ = new MySqlConnectionProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudSqlId If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
         * 
         * @return builder
         * 
         */
        public Builder cloudSqlId(@Nullable Output<String> cloudSqlId) {
            $.cloudSqlId = cloudSqlId;
            return this;
        }

        /**
         * @param cloudSqlId If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
         * 
         * @return builder
         * 
         */
        public Builder cloudSqlId(String cloudSqlId) {
            return cloudSqlId(Output.of(cloudSqlId));
        }

        /**
         * @param host The IP or hostname of the source MySQL database.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The IP or hostname of the source MySQL database.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param password Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port The network port of the source MySQL database.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The network port of the source MySQL database.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param ssl SSL configuration for the destination to connect to the source database.
         * 
         * @return builder
         * 
         */
        public Builder ssl(@Nullable Output<SslConfigArgs> ssl) {
            $.ssl = ssl;
            return this;
        }

        /**
         * @param ssl SSL configuration for the destination to connect to the source database.
         * 
         * @return builder
         * 
         */
        public Builder ssl(SslConfigArgs ssl) {
            return ssl(Output.of(ssl));
        }

        /**
         * @param username The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public MySqlConnectionProfileArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}