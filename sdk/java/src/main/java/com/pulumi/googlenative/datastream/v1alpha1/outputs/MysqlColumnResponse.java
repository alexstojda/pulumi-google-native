// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MysqlColumnResponse {
    /**
     * @return Column collation.
     * 
     */
    private String collation;
    /**
     * @return Column name.
     * 
     */
    private String columnName;
    /**
     * @return The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * 
     */
    private String dataType;
    /**
     * @return Column length.
     * 
     */
    private Integer length;
    /**
     * @return Whether or not the column can accept a null value.
     * 
     */
    private Boolean nullable;
    /**
     * @return The ordinal position of the column in the table.
     * 
     */
    private Integer ordinalPosition;
    /**
     * @return Whether or not the column represents a primary key.
     * 
     */
    private Boolean primaryKey;

    private MysqlColumnResponse() {}
    /**
     * @return Column collation.
     * 
     */
    public String collation() {
        return this.collation;
    }
    /**
     * @return Column name.
     * 
     */
    public String columnName() {
        return this.columnName;
    }
    /**
     * @return The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * 
     */
    public String dataType() {
        return this.dataType;
    }
    /**
     * @return Column length.
     * 
     */
    public Integer length() {
        return this.length;
    }
    /**
     * @return Whether or not the column can accept a null value.
     * 
     */
    public Boolean nullable() {
        return this.nullable;
    }
    /**
     * @return The ordinal position of the column in the table.
     * 
     */
    public Integer ordinalPosition() {
        return this.ordinalPosition;
    }
    /**
     * @return Whether or not the column represents a primary key.
     * 
     */
    public Boolean primaryKey() {
        return this.primaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlColumnResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String collation;
        private String columnName;
        private String dataType;
        private Integer length;
        private Boolean nullable;
        private Integer ordinalPosition;
        private Boolean primaryKey;
        public Builder() {}
        public Builder(MysqlColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.columnName = defaults.columnName;
    	      this.dataType = defaults.dataType;
    	      this.length = defaults.length;
    	      this.nullable = defaults.nullable;
    	      this.ordinalPosition = defaults.ordinalPosition;
    	      this.primaryKey = defaults.primaryKey;
        }

        @CustomType.Setter
        public Builder collation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }
        @CustomType.Setter
        public Builder columnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        @CustomType.Setter
        public Builder dataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        @CustomType.Setter
        public Builder length(Integer length) {
            this.length = Objects.requireNonNull(length);
            return this;
        }
        @CustomType.Setter
        public Builder nullable(Boolean nullable) {
            this.nullable = Objects.requireNonNull(nullable);
            return this;
        }
        @CustomType.Setter
        public Builder ordinalPosition(Integer ordinalPosition) {
            this.ordinalPosition = Objects.requireNonNull(ordinalPosition);
            return this;
        }
        @CustomType.Setter
        public Builder primaryKey(Boolean primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public MysqlColumnResponse build() {
            final var o = new MysqlColumnResponse();
            o.collation = collation;
            o.columnName = columnName;
            o.dataType = dataType;
            o.length = length;
            o.nullable = nullable;
            o.ordinalPosition = ordinalPosition;
            o.primaryKey = primaryKey;
            return o;
        }
    }
}