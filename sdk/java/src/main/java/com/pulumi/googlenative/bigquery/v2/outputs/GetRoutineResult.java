// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery.v2.outputs.ArgumentResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.RemoteFunctionOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.RoutineReferenceResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.StandardSqlDataTypeResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.StandardSqlTableTypeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoutineResult {
    /**
     * @return Optional.
     * 
     */
    private List<ArgumentResponse> arguments;
    /**
     * @return The time when this routine was created, in milliseconds since the epoch.
     * 
     */
    private String creationTime;
    /**
     * @return The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, &#34;\n&#34;, y))` The definition_body is `concat(x, &#34;\n&#34;, y)` (\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS &#39;return &#34;\n&#34;;\n&#39;` The definition_body is `return &#34;\n&#34;;\n` Note that both \n are replaced with linebreaks.
     * 
     */
    private String definitionBody;
    /**
     * @return Optional. The description of the routine, if defined.
     * 
     */
    private String description;
    /**
     * @return Optional. The determinism level of the JavaScript UDF, if defined.
     * 
     */
    private String determinismLevel;
    /**
     * @return A hash of this resource.
     * 
     */
    private String etag;
    /**
     * @return Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the imported JAVASCRIPT libraries.
     * 
     */
    private List<String> importedLibraries;
    /**
     * @return Optional. Defaults to &#34;SQL&#34;.
     * 
     */
    private String language;
    /**
     * @return The time when this routine was last modified, in milliseconds since the epoch.
     * 
     */
    private String lastModifiedTime;
    /**
     * @return Optional. Remote function specific options.
     * 
     */
    private RemoteFunctionOptionsResponse remoteFunctionOptions;
    /**
     * @return Optional. Can be set only if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return table type is inferred from definition_body at query time in each query that references this routine. If present, then the columns in the evaluated table result will be cast to match the column types specificed in return table type, at query time.
     * 
     */
    private StandardSqlTableTypeResponse returnTableType;
    /**
     * @return Optional if language = &#34;SQL&#34;; required otherwise. Cannot be set if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present, then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));` The return_type is `{type_kind: &#34;FLOAT64&#34;}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of `Decrement` remains FLOAT64.
     * 
     */
    private StandardSqlDataTypeResponse returnType;
    /**
     * @return Reference describing the ID of this routine.
     * 
     */
    private RoutineReferenceResponse routineReference;
    /**
     * @return The type of routine.
     * 
     */
    private String routineType;
    /**
     * @return Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.
     * 
     */
    private Boolean strictMode;

    private GetRoutineResult() {}
    /**
     * @return Optional.
     * 
     */
    public List<ArgumentResponse> arguments() {
        return this.arguments;
    }
    /**
     * @return The time when this routine was created, in milliseconds since the epoch.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, &#34;\n&#34;, y))` The definition_body is `concat(x, &#34;\n&#34;, y)` (\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS &#39;return &#34;\n&#34;;\n&#39;` The definition_body is `return &#34;\n&#34;;\n` Note that both \n are replaced with linebreaks.
     * 
     */
    public String definitionBody() {
        return this.definitionBody;
    }
    /**
     * @return Optional. The description of the routine, if defined.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. The determinism level of the JavaScript UDF, if defined.
     * 
     */
    public String determinismLevel() {
        return this.determinismLevel;
    }
    /**
     * @return A hash of this resource.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the imported JAVASCRIPT libraries.
     * 
     */
    public List<String> importedLibraries() {
        return this.importedLibraries;
    }
    /**
     * @return Optional. Defaults to &#34;SQL&#34;.
     * 
     */
    public String language() {
        return this.language;
    }
    /**
     * @return The time when this routine was last modified, in milliseconds since the epoch.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return Optional. Remote function specific options.
     * 
     */
    public RemoteFunctionOptionsResponse remoteFunctionOptions() {
        return this.remoteFunctionOptions;
    }
    /**
     * @return Optional. Can be set only if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return table type is inferred from definition_body at query time in each query that references this routine. If present, then the columns in the evaluated table result will be cast to match the column types specificed in return table type, at query time.
     * 
     */
    public StandardSqlTableTypeResponse returnTableType() {
        return this.returnTableType;
    }
    /**
     * @return Optional if language = &#34;SQL&#34;; required otherwise. Cannot be set if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present, then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));` The return_type is `{type_kind: &#34;FLOAT64&#34;}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of `Decrement` remains FLOAT64.
     * 
     */
    public StandardSqlDataTypeResponse returnType() {
        return this.returnType;
    }
    /**
     * @return Reference describing the ID of this routine.
     * 
     */
    public RoutineReferenceResponse routineReference() {
        return this.routineReference;
    }
    /**
     * @return The type of routine.
     * 
     */
    public String routineType() {
        return this.routineType;
    }
    /**
     * @return Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.
     * 
     */
    public Boolean strictMode() {
        return this.strictMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutineResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ArgumentResponse> arguments;
        private String creationTime;
        private String definitionBody;
        private String description;
        private String determinismLevel;
        private String etag;
        private List<String> importedLibraries;
        private String language;
        private String lastModifiedTime;
        private RemoteFunctionOptionsResponse remoteFunctionOptions;
        private StandardSqlTableTypeResponse returnTableType;
        private StandardSqlDataTypeResponse returnType;
        private RoutineReferenceResponse routineReference;
        private String routineType;
        private Boolean strictMode;
        public Builder() {}
        public Builder(GetRoutineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.creationTime = defaults.creationTime;
    	      this.definitionBody = defaults.definitionBody;
    	      this.description = defaults.description;
    	      this.determinismLevel = defaults.determinismLevel;
    	      this.etag = defaults.etag;
    	      this.importedLibraries = defaults.importedLibraries;
    	      this.language = defaults.language;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.remoteFunctionOptions = defaults.remoteFunctionOptions;
    	      this.returnTableType = defaults.returnTableType;
    	      this.returnType = defaults.returnType;
    	      this.routineReference = defaults.routineReference;
    	      this.routineType = defaults.routineType;
    	      this.strictMode = defaults.strictMode;
        }

        @CustomType.Setter
        public Builder arguments(List<ArgumentResponse> arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }
        public Builder arguments(ArgumentResponse... arguments) {
            return arguments(List.of(arguments));
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder definitionBody(String definitionBody) {
            this.definitionBody = Objects.requireNonNull(definitionBody);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder determinismLevel(String determinismLevel) {
            this.determinismLevel = Objects.requireNonNull(determinismLevel);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder importedLibraries(List<String> importedLibraries) {
            this.importedLibraries = Objects.requireNonNull(importedLibraries);
            return this;
        }
        public Builder importedLibraries(String... importedLibraries) {
            return importedLibraries(List.of(importedLibraries));
        }
        @CustomType.Setter
        public Builder language(String language) {
            this.language = Objects.requireNonNull(language);
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder remoteFunctionOptions(RemoteFunctionOptionsResponse remoteFunctionOptions) {
            this.remoteFunctionOptions = Objects.requireNonNull(remoteFunctionOptions);
            return this;
        }
        @CustomType.Setter
        public Builder returnTableType(StandardSqlTableTypeResponse returnTableType) {
            this.returnTableType = Objects.requireNonNull(returnTableType);
            return this;
        }
        @CustomType.Setter
        public Builder returnType(StandardSqlDataTypeResponse returnType) {
            this.returnType = Objects.requireNonNull(returnType);
            return this;
        }
        @CustomType.Setter
        public Builder routineReference(RoutineReferenceResponse routineReference) {
            this.routineReference = Objects.requireNonNull(routineReference);
            return this;
        }
        @CustomType.Setter
        public Builder routineType(String routineType) {
            this.routineType = Objects.requireNonNull(routineType);
            return this;
        }
        @CustomType.Setter
        public Builder strictMode(Boolean strictMode) {
            this.strictMode = Objects.requireNonNull(strictMode);
            return this;
        }
        public GetRoutineResult build() {
            final var o = new GetRoutineResult();
            o.arguments = arguments;
            o.creationTime = creationTime;
            o.definitionBody = definitionBody;
            o.description = description;
            o.determinismLevel = determinismLevel;
            o.etag = etag;
            o.importedLibraries = importedLibraries;
            o.language = language;
            o.lastModifiedTime = lastModifiedTime;
            o.remoteFunctionOptions = remoteFunctionOptions;
            o.returnTableType = returnTableType;
            o.returnType = returnType;
            o.routineReference = routineReference;
            o.routineType = routineType;
            o.strictMode = strictMode;
            return o;
        }
    }
}