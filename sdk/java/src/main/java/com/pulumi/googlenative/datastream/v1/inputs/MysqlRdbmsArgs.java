// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream.v1.inputs.MysqlDatabaseArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MySQL database structure
 * 
 */
public final class MysqlRdbmsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlRdbmsArgs Empty = new MysqlRdbmsArgs();

    /**
     * Mysql databases on the server
     * 
     */
    @Import(name="mysqlDatabases")
    private @Nullable Output<List<MysqlDatabaseArgs>> mysqlDatabases;

    /**
     * @return Mysql databases on the server
     * 
     */
    public Optional<Output<List<MysqlDatabaseArgs>>> mysqlDatabases() {
        return Optional.ofNullable(this.mysqlDatabases);
    }

    private MysqlRdbmsArgs() {}

    private MysqlRdbmsArgs(MysqlRdbmsArgs $) {
        this.mysqlDatabases = $.mysqlDatabases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlRdbmsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlRdbmsArgs $;

        public Builder() {
            $ = new MysqlRdbmsArgs();
        }

        public Builder(MysqlRdbmsArgs defaults) {
            $ = new MysqlRdbmsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mysqlDatabases Mysql databases on the server
         * 
         * @return builder
         * 
         */
        public Builder mysqlDatabases(@Nullable Output<List<MysqlDatabaseArgs>> mysqlDatabases) {
            $.mysqlDatabases = mysqlDatabases;
            return this;
        }

        /**
         * @param mysqlDatabases Mysql databases on the server
         * 
         * @return builder
         * 
         */
        public Builder mysqlDatabases(List<MysqlDatabaseArgs> mysqlDatabases) {
            return mysqlDatabases(Output.of(mysqlDatabases));
        }

        /**
         * @param mysqlDatabases Mysql databases on the server
         * 
         * @return builder
         * 
         */
        public Builder mysqlDatabases(MysqlDatabaseArgs... mysqlDatabases) {
            return mysqlDatabases(List.of(mysqlDatabases));
        }

        public MysqlRdbmsArgs build() {
            return $;
        }
    }

}