// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1GcsFileSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1GcsFilesetSpecResponse {
    /**
     * @return Patterns to identify a set of files in Google Cloud Storage. For more information, see [Wildcard Names] (https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note: Currently, bucket wildcards are not supported. Examples of valid `file_patterns`: * `gs://bucket_name/dir/*`: matches all files in `bucket_name/dir` directory * `gs://bucket_name/dir/**`: matches all files in `bucket_name/dir` and all subdirectories * `gs://bucket_name/file*`: matches files prefixed by `file` in `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` * `gs://bucket_name/a/*{@literal /}b`: matches all files in `bucket_name` that match the `a/*{@literal /}b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt` You can combine wildcards to match complex sets of files, for example: `gs://bucket_name/[a-m]??.j*g`
     * 
     */
    private List<String> filePatterns;
    /**
     * @return Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * 
     */
    private List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs;

    private GoogleCloudDatacatalogV1GcsFilesetSpecResponse() {}
    /**
     * @return Patterns to identify a set of files in Google Cloud Storage. For more information, see [Wildcard Names] (https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note: Currently, bucket wildcards are not supported. Examples of valid `file_patterns`: * `gs://bucket_name/dir/*`: matches all files in `bucket_name/dir` directory * `gs://bucket_name/dir/**`: matches all files in `bucket_name/dir` and all subdirectories * `gs://bucket_name/file*`: matches files prefixed by `file` in `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` * `gs://bucket_name/a/*{@literal /}b`: matches all files in `bucket_name` that match the `a/*{@literal /}b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt` You can combine wildcards to match complex sets of files, for example: `gs://bucket_name/[a-m]??.j*g`
     * 
     */
    public List<String> filePatterns() {
        return this.filePatterns;
    }
    /**
     * @return Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * 
     */
    public List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs() {
        return this.sampleGcsFileSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1GcsFilesetSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> filePatterns;
        private List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs;
        public Builder() {}
        public Builder(GoogleCloudDatacatalogV1GcsFilesetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePatterns = defaults.filePatterns;
    	      this.sampleGcsFileSpecs = defaults.sampleGcsFileSpecs;
        }

        @CustomType.Setter
        public Builder filePatterns(List<String> filePatterns) {
            this.filePatterns = Objects.requireNonNull(filePatterns);
            return this;
        }
        public Builder filePatterns(String... filePatterns) {
            return filePatterns(List.of(filePatterns));
        }
        @CustomType.Setter
        public Builder sampleGcsFileSpecs(List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs) {
            this.sampleGcsFileSpecs = Objects.requireNonNull(sampleGcsFileSpecs);
            return this;
        }
        public Builder sampleGcsFileSpecs(GoogleCloudDatacatalogV1GcsFileSpecResponse... sampleGcsFileSpecs) {
            return sampleGcsFileSpecs(List.of(sampleGcsFileSpecs));
        }
        public GoogleCloudDatacatalogV1GcsFilesetSpecResponse build() {
            final var o = new GoogleCloudDatacatalogV1GcsFilesetSpecResponse();
            o.filePatterns = filePatterns;
            o.sampleGcsFileSpecs = sampleGcsFileSpecs;
            return o;
        }
    }
}