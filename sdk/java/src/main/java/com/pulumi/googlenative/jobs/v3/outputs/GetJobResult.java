// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.jobs.v3.outputs.ApplicationInfoResponse;
import com.pulumi.googlenative.jobs.v3.outputs.CompensationInfoResponse;
import com.pulumi.googlenative.jobs.v3.outputs.JobDerivedInfoResponse;
import com.pulumi.googlenative.jobs.v3.outputs.ProcessingOptionsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    /**
     * @return Optional but strongly recommended for the best service experience. Location(s) where the employer is looking to hire for this job posting. Specifying the full street address(es) of the hiring location enables better API results, especially job searches by commute time. At most 50 locations are allowed for best search performance. If a job has more locations, it is suggested to split it into multiple jobs with unique requisition_ids (e.g. &#39;ReqA&#39; becomes &#39;ReqA-1&#39;, &#39;ReqA-2&#39;, etc.) as multiple jobs with the same company_name, language_code and requisition_id are not allowed. If the original requisition_id must be preserved, a custom field should be used for storage. It is also suggested to group the locations that close to each other in the same job for better search experience. Jobs with multiple addresses must have their addresses with the same LocationType to allow location filtering to work properly. (For example, a Job with addresses &#34;1600 Amphitheatre Parkway, Mountain View, CA, USA&#34; and &#34;London, UK&#34; may not have location filters applied correctly at search time since the first is a LocationType.STREET_ADDRESS and the second is a LocationType.LOCALITY.) If a job needs to have multiple addresses, it is suggested to split it into multiple jobs with same LocationTypes. The maximum number of allowed characters is 500.
     * 
     */
    private List<String> addresses;
    /**
     * @return At least one field within ApplicationInfo must be specified. Job application information.
     * 
     */
    private ApplicationInfoResponse applicationInfo;
    /**
     * @return Display name of the company listing the job.
     * 
     */
    private String companyDisplayName;
    /**
     * @return The resource name of the company listing the job, such as &#34;projects/api-test-project/companies/foo&#34;.
     * 
     */
    private String companyName;
    /**
     * @return Optional. Job compensation information.
     * 
     */
    private CompensationInfoResponse compensationInfo;
    /**
     * @return Optional. A map of fields to hold both filterable and non-filterable custom job attributes that are not covered by the provided structured fields. The keys of the map are strings up to 64 bytes and must match the pattern: a-zA-Z*. For example, key0LikeThis or KEY_1_LIKE_THIS. At most 100 filterable and at most 100 unfilterable keys are supported. For filterable `string_values`, across all keys at most 200 values are allowed, with each string no more than 255 characters. For unfilterable `string_values`, the maximum total size of `string_values` across all keys is 50KB.
     * 
     */
    private Map<String,String> customAttributes;
    /**
     * @return Optional. The desired education degrees for the job, such as Bachelors, Masters.
     * 
     */
    private List<String> degreeTypes;
    /**
     * @return Optional. The department or functional area within the company with the open position. The maximum number of allowed characters is 255.
     * 
     */
    private String department;
    /**
     * @return Derived details about the job posting.
     * 
     */
    private JobDerivedInfoResponse derivedInfo;
    /**
     * @return The description of the job, which typically includes a multi-paragraph description of the company and related information. Separate fields are provided on the job object for responsibilities, qualifications, and other job characteristics. Use of these separate job fields is recommended. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 100,000.
     * 
     */
    private String description;
    /**
     * @return Optional. The employment type(s) of a job, for example, full time or part time.
     * 
     */
    private List<String> employmentTypes;
    /**
     * @return Optional. A description of bonus, commission, and other compensation incentives associated with the job not including salary or pay. The maximum number of allowed characters is 10,000.
     * 
     */
    private String incentives;
    /**
     * @return Optional. The benefits included with the job.
     * 
     */
    private List<String> jobBenefits;
    /**
     * @return Optional. The end timestamp of the job. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    private String jobEndTime;
    /**
     * @return Optional. The experience level associated with the job, such as &#34;Entry Level&#34;.
     * 
     */
    private String jobLevel;
    /**
     * @return Optional. The start timestamp of the job in UTC time zone. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    private String jobStartTime;
    /**
     * @return Optional. The language of the posting. This field is distinct from any requirements for fluency that are associated with the job. Language codes must be in BCP-47 format, such as &#34;en-US&#34; or &#34;sr-Latn&#34;. For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47){: class=&#34;external&#34; target=&#34;_blank&#34; }. If this field is unspecified and Job.description is present, detected language code based on Job.description is assigned, otherwise defaults to &#39;en_US&#39;.
     * 
     */
    private String languageCode;
    /**
     * @return Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is &#34;projects/{project_id}/jobs/{job_id}&#34;, for example, &#34;projects/api-test-project/jobs/1234&#34;. Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
     * 
     */
    private String name;
    /**
     * @return The timestamp when this job posting was created.
     * 
     */
    private String postingCreateTime;
    /**
     * @return Optional but strongly recommended for the best service experience. The expiration timestamp of the job. After this timestamp, the job is marked as expired, and it no longer appears in search results. The expired job can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it can be retrieved with the GetJob API or updated with the UpdateJob API. An expired job can be updated and opened again by using a future expiration timestamp. Updating an expired job fails if there is another existing open job with same company_name, language_code and requisition_id. The expired jobs are retained in our system for 90 days. However, the overall expired job count cannot exceed 3 times the maximum of open jobs count over the past week, otherwise jobs with earlier expire time are cleaned first. Expired jobs are no longer accessible after they are cleaned out. Invalid timestamps are ignored, and treated as expire time not provided. Timestamp before the instant request is made is considered valid, the job will be treated as expired immediately. If this value is not provided at the time of job creation or is invalid, the job posting expires after 30 days from the job&#39;s creation time. For example, if the job was created on 2017/01/01 13:00AM UTC with an unspecified expiration date, the job expires after 2017/01/31 13:00AM UTC. If this value is not provided on job update, it depends on the field masks set by UpdateJobRequest.update_mask. If the field masks include expiry_time, or the masks are empty meaning that every field is updated, the job posting expires after 30 days from the job&#39;s last update time. Otherwise the expiration date isn&#39;t updated.
     * 
     */
    private String postingExpireTime;
    /**
     * @return Optional. The timestamp this job posting was most recently published. The default value is the time the request arrives at the server. Invalid timestamps are ignored.
     * 
     */
    private String postingPublishTime;
    /**
     * @return Optional. The job PostingRegion (for example, state, country) throughout which the job is available. If this field is set, a LocationFilter in a search query within the job region finds this job posting if an exact location match isn&#39;t specified. If this field is set to PostingRegion.NATION or PostingRegion.ADMINISTRATIVE_AREA, setting job Job.addresses to the same location level as this field is strongly recommended.
     * 
     */
    private String postingRegion;
    /**
     * @return The timestamp when this job posting was last updated.
     * 
     */
    private String postingUpdateTime;
    /**
     * @return Optional. Options for job processing.
     * 
     */
    private ProcessingOptionsResponse processingOptions;
    /**
     * @return Optional. A promotion value of the job, as determined by the client. The value determines the sort order of the jobs returned when searching for jobs using the featured jobs search call, with higher promotional values being returned first and ties being resolved by relevance sort. Only the jobs with a promotionValue &gt;0 are returned in a FEATURED_JOB_SEARCH. Default value is 0, and negative values are treated as 0.
     * 
     */
    private Integer promotionValue;
    /**
     * @return Optional. A description of the qualifications required to perform the job. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    private String qualifications;
    /**
     * @return The requisition ID, also referred to as the posting ID, assigned by the client to identify a job. This field is intended to be used by clients for client identification and tracking of postings. A job is not allowed to be created if there is another job with the same [company_name], language_code and requisition_id. The maximum number of allowed characters is 255.
     * 
     */
    private String requisitionId;
    /**
     * @return Optional. A description of job responsibilities. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    private String responsibilities;
    /**
     * @return The title of the job, such as &#34;Software Engineer&#34; The maximum number of allowed characters is 500.
     * 
     */
    private String title;
    /**
     * @return Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified.
     * 
     * @deprecated
     * Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified.
     * 
     */
    @Deprecated /* Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified. */
    private String visibility;

    private GetJobResult() {}
    /**
     * @return Optional but strongly recommended for the best service experience. Location(s) where the employer is looking to hire for this job posting. Specifying the full street address(es) of the hiring location enables better API results, especially job searches by commute time. At most 50 locations are allowed for best search performance. If a job has more locations, it is suggested to split it into multiple jobs with unique requisition_ids (e.g. &#39;ReqA&#39; becomes &#39;ReqA-1&#39;, &#39;ReqA-2&#39;, etc.) as multiple jobs with the same company_name, language_code and requisition_id are not allowed. If the original requisition_id must be preserved, a custom field should be used for storage. It is also suggested to group the locations that close to each other in the same job for better search experience. Jobs with multiple addresses must have their addresses with the same LocationType to allow location filtering to work properly. (For example, a Job with addresses &#34;1600 Amphitheatre Parkway, Mountain View, CA, USA&#34; and &#34;London, UK&#34; may not have location filters applied correctly at search time since the first is a LocationType.STREET_ADDRESS and the second is a LocationType.LOCALITY.) If a job needs to have multiple addresses, it is suggested to split it into multiple jobs with same LocationTypes. The maximum number of allowed characters is 500.
     * 
     */
    public List<String> addresses() {
        return this.addresses;
    }
    /**
     * @return At least one field within ApplicationInfo must be specified. Job application information.
     * 
     */
    public ApplicationInfoResponse applicationInfo() {
        return this.applicationInfo;
    }
    /**
     * @return Display name of the company listing the job.
     * 
     */
    public String companyDisplayName() {
        return this.companyDisplayName;
    }
    /**
     * @return The resource name of the company listing the job, such as &#34;projects/api-test-project/companies/foo&#34;.
     * 
     */
    public String companyName() {
        return this.companyName;
    }
    /**
     * @return Optional. Job compensation information.
     * 
     */
    public CompensationInfoResponse compensationInfo() {
        return this.compensationInfo;
    }
    /**
     * @return Optional. A map of fields to hold both filterable and non-filterable custom job attributes that are not covered by the provided structured fields. The keys of the map are strings up to 64 bytes and must match the pattern: a-zA-Z*. For example, key0LikeThis or KEY_1_LIKE_THIS. At most 100 filterable and at most 100 unfilterable keys are supported. For filterable `string_values`, across all keys at most 200 values are allowed, with each string no more than 255 characters. For unfilterable `string_values`, the maximum total size of `string_values` across all keys is 50KB.
     * 
     */
    public Map<String,String> customAttributes() {
        return this.customAttributes;
    }
    /**
     * @return Optional. The desired education degrees for the job, such as Bachelors, Masters.
     * 
     */
    public List<String> degreeTypes() {
        return this.degreeTypes;
    }
    /**
     * @return Optional. The department or functional area within the company with the open position. The maximum number of allowed characters is 255.
     * 
     */
    public String department() {
        return this.department;
    }
    /**
     * @return Derived details about the job posting.
     * 
     */
    public JobDerivedInfoResponse derivedInfo() {
        return this.derivedInfo;
    }
    /**
     * @return The description of the job, which typically includes a multi-paragraph description of the company and related information. Separate fields are provided on the job object for responsibilities, qualifications, and other job characteristics. Use of these separate job fields is recommended. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 100,000.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. The employment type(s) of a job, for example, full time or part time.
     * 
     */
    public List<String> employmentTypes() {
        return this.employmentTypes;
    }
    /**
     * @return Optional. A description of bonus, commission, and other compensation incentives associated with the job not including salary or pay. The maximum number of allowed characters is 10,000.
     * 
     */
    public String incentives() {
        return this.incentives;
    }
    /**
     * @return Optional. The benefits included with the job.
     * 
     */
    public List<String> jobBenefits() {
        return this.jobBenefits;
    }
    /**
     * @return Optional. The end timestamp of the job. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    public String jobEndTime() {
        return this.jobEndTime;
    }
    /**
     * @return Optional. The experience level associated with the job, such as &#34;Entry Level&#34;.
     * 
     */
    public String jobLevel() {
        return this.jobLevel;
    }
    /**
     * @return Optional. The start timestamp of the job in UTC time zone. Typically this field is used for contracting engagements. Invalid timestamps are ignored.
     * 
     */
    public String jobStartTime() {
        return this.jobStartTime;
    }
    /**
     * @return Optional. The language of the posting. This field is distinct from any requirements for fluency that are associated with the job. Language codes must be in BCP-47 format, such as &#34;en-US&#34; or &#34;sr-Latn&#34;. For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47){: class=&#34;external&#34; target=&#34;_blank&#34; }. If this field is unspecified and Job.description is present, detected language code based on Job.description is assigned, otherwise defaults to &#39;en_US&#39;.
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * @return Required during job update. The resource name for the job. This is generated by the service when a job is created. The format is &#34;projects/{project_id}/jobs/{job_id}&#34;, for example, &#34;projects/api-test-project/jobs/1234&#34;. Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The timestamp when this job posting was created.
     * 
     */
    public String postingCreateTime() {
        return this.postingCreateTime;
    }
    /**
     * @return Optional but strongly recommended for the best service experience. The expiration timestamp of the job. After this timestamp, the job is marked as expired, and it no longer appears in search results. The expired job can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it can be retrieved with the GetJob API or updated with the UpdateJob API. An expired job can be updated and opened again by using a future expiration timestamp. Updating an expired job fails if there is another existing open job with same company_name, language_code and requisition_id. The expired jobs are retained in our system for 90 days. However, the overall expired job count cannot exceed 3 times the maximum of open jobs count over the past week, otherwise jobs with earlier expire time are cleaned first. Expired jobs are no longer accessible after they are cleaned out. Invalid timestamps are ignored, and treated as expire time not provided. Timestamp before the instant request is made is considered valid, the job will be treated as expired immediately. If this value is not provided at the time of job creation or is invalid, the job posting expires after 30 days from the job&#39;s creation time. For example, if the job was created on 2017/01/01 13:00AM UTC with an unspecified expiration date, the job expires after 2017/01/31 13:00AM UTC. If this value is not provided on job update, it depends on the field masks set by UpdateJobRequest.update_mask. If the field masks include expiry_time, or the masks are empty meaning that every field is updated, the job posting expires after 30 days from the job&#39;s last update time. Otherwise the expiration date isn&#39;t updated.
     * 
     */
    public String postingExpireTime() {
        return this.postingExpireTime;
    }
    /**
     * @return Optional. The timestamp this job posting was most recently published. The default value is the time the request arrives at the server. Invalid timestamps are ignored.
     * 
     */
    public String postingPublishTime() {
        return this.postingPublishTime;
    }
    /**
     * @return Optional. The job PostingRegion (for example, state, country) throughout which the job is available. If this field is set, a LocationFilter in a search query within the job region finds this job posting if an exact location match isn&#39;t specified. If this field is set to PostingRegion.NATION or PostingRegion.ADMINISTRATIVE_AREA, setting job Job.addresses to the same location level as this field is strongly recommended.
     * 
     */
    public String postingRegion() {
        return this.postingRegion;
    }
    /**
     * @return The timestamp when this job posting was last updated.
     * 
     */
    public String postingUpdateTime() {
        return this.postingUpdateTime;
    }
    /**
     * @return Optional. Options for job processing.
     * 
     */
    public ProcessingOptionsResponse processingOptions() {
        return this.processingOptions;
    }
    /**
     * @return Optional. A promotion value of the job, as determined by the client. The value determines the sort order of the jobs returned when searching for jobs using the featured jobs search call, with higher promotional values being returned first and ties being resolved by relevance sort. Only the jobs with a promotionValue &gt;0 are returned in a FEATURED_JOB_SEARCH. Default value is 0, and negative values are treated as 0.
     * 
     */
    public Integer promotionValue() {
        return this.promotionValue;
    }
    /**
     * @return Optional. A description of the qualifications required to perform the job. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    public String qualifications() {
        return this.qualifications;
    }
    /**
     * @return The requisition ID, also referred to as the posting ID, assigned by the client to identify a job. This field is intended to be used by clients for client identification and tracking of postings. A job is not allowed to be created if there is another job with the same [company_name], language_code and requisition_id. The maximum number of allowed characters is 255.
     * 
     */
    public String requisitionId() {
        return this.requisitionId;
    }
    /**
     * @return Optional. A description of job responsibilities. The use of this field is recommended as an alternative to using the more general description field. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 10,000.
     * 
     */
    public String responsibilities() {
        return this.responsibilities;
    }
    /**
     * @return The title of the job, such as &#34;Software Engineer&#34; The maximum number of allowed characters is 500.
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified.
     * 
     * @deprecated
     * Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified.
     * 
     */
    @Deprecated /* Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified. */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addresses;
        private ApplicationInfoResponse applicationInfo;
        private String companyDisplayName;
        private String companyName;
        private CompensationInfoResponse compensationInfo;
        private Map<String,String> customAttributes;
        private List<String> degreeTypes;
        private String department;
        private JobDerivedInfoResponse derivedInfo;
        private String description;
        private List<String> employmentTypes;
        private String incentives;
        private List<String> jobBenefits;
        private String jobEndTime;
        private String jobLevel;
        private String jobStartTime;
        private String languageCode;
        private String name;
        private String postingCreateTime;
        private String postingExpireTime;
        private String postingPublishTime;
        private String postingRegion;
        private String postingUpdateTime;
        private ProcessingOptionsResponse processingOptions;
        private Integer promotionValue;
        private String qualifications;
        private String requisitionId;
        private String responsibilities;
        private String title;
        private String visibility;
        public Builder() {}
        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.applicationInfo = defaults.applicationInfo;
    	      this.companyDisplayName = defaults.companyDisplayName;
    	      this.companyName = defaults.companyName;
    	      this.compensationInfo = defaults.compensationInfo;
    	      this.customAttributes = defaults.customAttributes;
    	      this.degreeTypes = defaults.degreeTypes;
    	      this.department = defaults.department;
    	      this.derivedInfo = defaults.derivedInfo;
    	      this.description = defaults.description;
    	      this.employmentTypes = defaults.employmentTypes;
    	      this.incentives = defaults.incentives;
    	      this.jobBenefits = defaults.jobBenefits;
    	      this.jobEndTime = defaults.jobEndTime;
    	      this.jobLevel = defaults.jobLevel;
    	      this.jobStartTime = defaults.jobStartTime;
    	      this.languageCode = defaults.languageCode;
    	      this.name = defaults.name;
    	      this.postingCreateTime = defaults.postingCreateTime;
    	      this.postingExpireTime = defaults.postingExpireTime;
    	      this.postingPublishTime = defaults.postingPublishTime;
    	      this.postingRegion = defaults.postingRegion;
    	      this.postingUpdateTime = defaults.postingUpdateTime;
    	      this.processingOptions = defaults.processingOptions;
    	      this.promotionValue = defaults.promotionValue;
    	      this.qualifications = defaults.qualifications;
    	      this.requisitionId = defaults.requisitionId;
    	      this.responsibilities = defaults.responsibilities;
    	      this.title = defaults.title;
    	      this.visibility = defaults.visibility;
        }

        @CustomType.Setter
        public Builder addresses(List<String> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder applicationInfo(ApplicationInfoResponse applicationInfo) {
            this.applicationInfo = Objects.requireNonNull(applicationInfo);
            return this;
        }
        @CustomType.Setter
        public Builder companyDisplayName(String companyDisplayName) {
            this.companyDisplayName = Objects.requireNonNull(companyDisplayName);
            return this;
        }
        @CustomType.Setter
        public Builder companyName(String companyName) {
            this.companyName = Objects.requireNonNull(companyName);
            return this;
        }
        @CustomType.Setter
        public Builder compensationInfo(CompensationInfoResponse compensationInfo) {
            this.compensationInfo = Objects.requireNonNull(compensationInfo);
            return this;
        }
        @CustomType.Setter
        public Builder customAttributes(Map<String,String> customAttributes) {
            this.customAttributes = Objects.requireNonNull(customAttributes);
            return this;
        }
        @CustomType.Setter
        public Builder degreeTypes(List<String> degreeTypes) {
            this.degreeTypes = Objects.requireNonNull(degreeTypes);
            return this;
        }
        public Builder degreeTypes(String... degreeTypes) {
            return degreeTypes(List.of(degreeTypes));
        }
        @CustomType.Setter
        public Builder department(String department) {
            this.department = Objects.requireNonNull(department);
            return this;
        }
        @CustomType.Setter
        public Builder derivedInfo(JobDerivedInfoResponse derivedInfo) {
            this.derivedInfo = Objects.requireNonNull(derivedInfo);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder employmentTypes(List<String> employmentTypes) {
            this.employmentTypes = Objects.requireNonNull(employmentTypes);
            return this;
        }
        public Builder employmentTypes(String... employmentTypes) {
            return employmentTypes(List.of(employmentTypes));
        }
        @CustomType.Setter
        public Builder incentives(String incentives) {
            this.incentives = Objects.requireNonNull(incentives);
            return this;
        }
        @CustomType.Setter
        public Builder jobBenefits(List<String> jobBenefits) {
            this.jobBenefits = Objects.requireNonNull(jobBenefits);
            return this;
        }
        public Builder jobBenefits(String... jobBenefits) {
            return jobBenefits(List.of(jobBenefits));
        }
        @CustomType.Setter
        public Builder jobEndTime(String jobEndTime) {
            this.jobEndTime = Objects.requireNonNull(jobEndTime);
            return this;
        }
        @CustomType.Setter
        public Builder jobLevel(String jobLevel) {
            this.jobLevel = Objects.requireNonNull(jobLevel);
            return this;
        }
        @CustomType.Setter
        public Builder jobStartTime(String jobStartTime) {
            this.jobStartTime = Objects.requireNonNull(jobStartTime);
            return this;
        }
        @CustomType.Setter
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder postingCreateTime(String postingCreateTime) {
            this.postingCreateTime = Objects.requireNonNull(postingCreateTime);
            return this;
        }
        @CustomType.Setter
        public Builder postingExpireTime(String postingExpireTime) {
            this.postingExpireTime = Objects.requireNonNull(postingExpireTime);
            return this;
        }
        @CustomType.Setter
        public Builder postingPublishTime(String postingPublishTime) {
            this.postingPublishTime = Objects.requireNonNull(postingPublishTime);
            return this;
        }
        @CustomType.Setter
        public Builder postingRegion(String postingRegion) {
            this.postingRegion = Objects.requireNonNull(postingRegion);
            return this;
        }
        @CustomType.Setter
        public Builder postingUpdateTime(String postingUpdateTime) {
            this.postingUpdateTime = Objects.requireNonNull(postingUpdateTime);
            return this;
        }
        @CustomType.Setter
        public Builder processingOptions(ProcessingOptionsResponse processingOptions) {
            this.processingOptions = Objects.requireNonNull(processingOptions);
            return this;
        }
        @CustomType.Setter
        public Builder promotionValue(Integer promotionValue) {
            this.promotionValue = Objects.requireNonNull(promotionValue);
            return this;
        }
        @CustomType.Setter
        public Builder qualifications(String qualifications) {
            this.qualifications = Objects.requireNonNull(qualifications);
            return this;
        }
        @CustomType.Setter
        public Builder requisitionId(String requisitionId) {
            this.requisitionId = Objects.requireNonNull(requisitionId);
            return this;
        }
        @CustomType.Setter
        public Builder responsibilities(String responsibilities) {
            this.responsibilities = Objects.requireNonNull(responsibilities);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        @CustomType.Setter
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }
        public GetJobResult build() {
            final var o = new GetJobResult();
            o.addresses = addresses;
            o.applicationInfo = applicationInfo;
            o.companyDisplayName = companyDisplayName;
            o.companyName = companyName;
            o.compensationInfo = compensationInfo;
            o.customAttributes = customAttributes;
            o.degreeTypes = degreeTypes;
            o.department = department;
            o.derivedInfo = derivedInfo;
            o.description = description;
            o.employmentTypes = employmentTypes;
            o.incentives = incentives;
            o.jobBenefits = jobBenefits;
            o.jobEndTime = jobEndTime;
            o.jobLevel = jobLevel;
            o.jobStartTime = jobStartTime;
            o.languageCode = languageCode;
            o.name = name;
            o.postingCreateTime = postingCreateTime;
            o.postingExpireTime = postingExpireTime;
            o.postingPublishTime = postingPublishTime;
            o.postingRegion = postingRegion;
            o.postingUpdateTime = postingUpdateTime;
            o.processingOptions = processingOptions;
            o.promotionValue = promotionValue;
            o.qualifications = qualifications;
            o.requisitionId = requisitionId;
            o.responsibilities = responsibilities;
            o.title = title;
            o.visibility = visibility;
            return o;
        }
    }
}