// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaseml.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.firebaseml.v1beta2.inputs.ModelStateArgs;
import com.pulumi.googlenative.firebaseml.v1beta2.inputs.TfLiteModelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * State common to all model types. Includes publishing and validation information.
     * 
     */
    @Import(name="state")
    private @Nullable Output<ModelStateArgs> state;

    /**
     * @return State common to all model types. Includes publishing and validation information.
     * 
     */
    public Optional<Output<ModelStateArgs>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * User defined tags which can be used to group/filter models during listing
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return User defined tags which can be used to group/filter models during listing
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A TFLite Model
     * 
     */
    @Import(name="tfliteModel")
    private @Nullable Output<TfLiteModelArgs> tfliteModel;

    /**
     * @return A TFLite Model
     * 
     */
    public Optional<Output<TfLiteModelArgs>> tfliteModel() {
        return Optional.ofNullable(this.tfliteModel);
    }

    private ModelArgs() {}

    private ModelArgs(ModelArgs $) {
        this.displayName = $.displayName;
        this.name = $.name;
        this.project = $.project;
        this.state = $.state;
        this.tags = $.tags;
        this.tfliteModel = $.tfliteModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelArgs $;

        public Builder() {
            $ = new ModelArgs();
        }

        public Builder(ModelArgs defaults) {
            $ = new ModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state State common to all model types. Includes publishing and validation information.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<ModelStateArgs> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State common to all model types. Includes publishing and validation information.
         * 
         * @return builder
         * 
         */
        public Builder state(ModelStateArgs state) {
            return state(Output.of(state));
        }

        /**
         * @param tags User defined tags which can be used to group/filter models during listing
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags User defined tags which can be used to group/filter models during listing
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags User defined tags which can be used to group/filter models during listing
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tfliteModel A TFLite Model
         * 
         * @return builder
         * 
         */
        public Builder tfliteModel(@Nullable Output<TfLiteModelArgs> tfliteModel) {
            $.tfliteModel = tfliteModel;
            return this;
        }

        /**
         * @param tfliteModel A TFLite Model
         * 
         * @return builder
         * 
         */
        public Builder tfliteModel(TfLiteModelArgs tfliteModel) {
            return tfliteModel(Output.of(tfliteModel));
        }

        public ModelArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}