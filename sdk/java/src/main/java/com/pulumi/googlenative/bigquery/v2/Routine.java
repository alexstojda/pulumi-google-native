// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.bigquery.v2.RoutineArgs;
import com.pulumi.googlenative.bigquery.v2.outputs.ArgumentResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.RemoteFunctionOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.RoutineReferenceResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.StandardSqlDataTypeResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.StandardSqlTableTypeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new routine in the dataset.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:bigquery/v2:Routine")
public class Routine extends com.pulumi.resources.CustomResource {
    /**
     * Optional.
     * 
     */
    @Export(name="arguments", type=List.class, parameters={ArgumentResponse.class})
    private Output<List<ArgumentResponse>> arguments;

    /**
     * @return Optional.
     * 
     */
    public Output<List<ArgumentResponse>> arguments() {
        return this.arguments;
    }
    /**
     * The time when this routine was created, in milliseconds since the epoch.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time when this routine was created, in milliseconds since the epoch.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    @Export(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }
    /**
     * The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, &#34;\n&#34;, y))` The definition_body is `concat(x, &#34;\n&#34;, y)` (\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS &#39;return &#34;\n&#34;;\n&#39;` The definition_body is `return &#34;\n&#34;;\n` Note that both \n are replaced with linebreaks.
     * 
     */
    @Export(name="definitionBody", type=String.class, parameters={})
    private Output<String> definitionBody;

    /**
     * @return The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, &#34;\n&#34;, y))` The definition_body is `concat(x, &#34;\n&#34;, y)` (\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS &#39;return &#34;\n&#34;;\n&#39;` The definition_body is `return &#34;\n&#34;;\n` Note that both \n are replaced with linebreaks.
     * 
     */
    public Output<String> definitionBody() {
        return this.definitionBody;
    }
    /**
     * Optional. The description of the routine, if defined.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. The description of the routine, if defined.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Optional. The determinism level of the JavaScript UDF, if defined.
     * 
     */
    @Export(name="determinismLevel", type=String.class, parameters={})
    private Output<String> determinismLevel;

    /**
     * @return Optional. The determinism level of the JavaScript UDF, if defined.
     * 
     */
    public Output<String> determinismLevel() {
        return this.determinismLevel;
    }
    /**
     * A hash of this resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A hash of this resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the imported JAVASCRIPT libraries.
     * 
     */
    @Export(name="importedLibraries", type=List.class, parameters={String.class})
    private Output<List<String>> importedLibraries;

    /**
     * @return Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the imported JAVASCRIPT libraries.
     * 
     */
    public Output<List<String>> importedLibraries() {
        return this.importedLibraries;
    }
    /**
     * Optional. Defaults to &#34;SQL&#34;.
     * 
     */
    @Export(name="language", type=String.class, parameters={})
    private Output<String> language;

    /**
     * @return Optional. Defaults to &#34;SQL&#34;.
     * 
     */
    public Output<String> language() {
        return this.language;
    }
    /**
     * The time when this routine was last modified, in milliseconds since the epoch.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return The time when this routine was last modified, in milliseconds since the epoch.
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Optional. Remote function specific options.
     * 
     */
    @Export(name="remoteFunctionOptions", type=RemoteFunctionOptionsResponse.class, parameters={})
    private Output<RemoteFunctionOptionsResponse> remoteFunctionOptions;

    /**
     * @return Optional. Remote function specific options.
     * 
     */
    public Output<RemoteFunctionOptionsResponse> remoteFunctionOptions() {
        return this.remoteFunctionOptions;
    }
    /**
     * Optional. Can be set only if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return table type is inferred from definition_body at query time in each query that references this routine. If present, then the columns in the evaluated table result will be cast to match the column types specificed in return table type, at query time.
     * 
     */
    @Export(name="returnTableType", type=StandardSqlTableTypeResponse.class, parameters={})
    private Output<StandardSqlTableTypeResponse> returnTableType;

    /**
     * @return Optional. Can be set only if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return table type is inferred from definition_body at query time in each query that references this routine. If present, then the columns in the evaluated table result will be cast to match the column types specificed in return table type, at query time.
     * 
     */
    public Output<StandardSqlTableTypeResponse> returnTableType() {
        return this.returnTableType;
    }
    /**
     * Optional if language = &#34;SQL&#34;; required otherwise. Cannot be set if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present, then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));` The return_type is `{type_kind: &#34;FLOAT64&#34;}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of `Decrement` remains FLOAT64.
     * 
     */
    @Export(name="returnType", type=StandardSqlDataTypeResponse.class, parameters={})
    private Output<StandardSqlDataTypeResponse> returnType;

    /**
     * @return Optional if language = &#34;SQL&#34;; required otherwise. Cannot be set if routine_type = &#34;TABLE_VALUED_FUNCTION&#34;. If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present, then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));` The return_type is `{type_kind: &#34;FLOAT64&#34;}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of `Decrement` remains FLOAT64.
     * 
     */
    public Output<StandardSqlDataTypeResponse> returnType() {
        return this.returnType;
    }
    /**
     * Reference describing the ID of this routine.
     * 
     */
    @Export(name="routineReference", type=RoutineReferenceResponse.class, parameters={})
    private Output<RoutineReferenceResponse> routineReference;

    /**
     * @return Reference describing the ID of this routine.
     * 
     */
    public Output<RoutineReferenceResponse> routineReference() {
        return this.routineReference;
    }
    /**
     * The type of routine.
     * 
     */
    @Export(name="routineType", type=String.class, parameters={})
    private Output<String> routineType;

    /**
     * @return The type of routine.
     * 
     */
    public Output<String> routineType() {
        return this.routineType;
    }
    /**
     * Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.
     * 
     */
    @Export(name="strictMode", type=Boolean.class, parameters={})
    private Output<Boolean> strictMode;

    /**
     * @return Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.
     * 
     */
    public Output<Boolean> strictMode() {
        return this.strictMode;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Routine(String name) {
        this(name, RoutineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Routine(String name, RoutineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Routine(String name, RoutineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Routine", name, args == null ? RoutineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Routine(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Routine", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Routine get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Routine(name, id, options);
    }
}