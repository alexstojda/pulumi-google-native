// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream.v1.outputs.OracleColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OracleTableResponse {
    /**
     * @return Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    private List<OracleColumnResponse> oracleColumns;
    /**
     * @return Table name.
     * 
     */
    private String table;

    private OracleTableResponse() {}
    /**
     * @return Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    public List<OracleColumnResponse> oracleColumns() {
        return this.oracleColumns;
    }
    /**
     * @return Table name.
     * 
     */
    public String table() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleTableResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OracleColumnResponse> oracleColumns;
        private String table;
        public Builder() {}
        public Builder(OracleTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleColumns = defaults.oracleColumns;
    	      this.table = defaults.table;
        }

        @CustomType.Setter
        public Builder oracleColumns(List<OracleColumnResponse> oracleColumns) {
            this.oracleColumns = Objects.requireNonNull(oracleColumns);
            return this;
        }
        public Builder oracleColumns(OracleColumnResponse... oracleColumns) {
            return oracleColumns(List.of(oracleColumns));
        }
        @CustomType.Setter
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public OracleTableResponse build() {
            final var o = new OracleTableResponse();
            o.oracleColumns = oracleColumns;
            o.table = table;
            return o;
        }
    }
}