/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.devicefarm;

import com.amazonaws.services.devicefarm.model.*;

/**
 * Abstract implementation of {@code AWSDeviceFarm}. Convenient method forms
 * pass through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSDeviceFarm implements AWSDeviceFarm {

    protected AbstractAWSDeviceFarm() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDevicePoolResult createDevicePool(
            CreateDevicePoolRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUploadResult createUpload(CreateUploadRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountSettingsResult getAccountSettings(
            GetAccountSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeviceResult getDevice(GetDeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDevicePoolResult getDevicePool(GetDevicePoolRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDevicePoolCompatibilityResult getDevicePoolCompatibility(
            GetDevicePoolCompatibilityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetJobResult getJob(GetJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetProjectResult getProject(GetProjectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRunResult getRun(GetRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSuiteResult getSuite(GetSuiteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTestResult getTest(GetTestRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetUploadResult getUpload(GetUploadRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListArtifactsResult listArtifacts(ListArtifactsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDevicePoolsResult listDevicePools(ListDevicePoolsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRunsResult listRuns(ListRunsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSamplesResult listSamples(ListSamplesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSuitesResult listSuites(ListSuitesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTestsResult listTests(ListTestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUniqueProblemsResult listUniqueProblems(
            ListUniqueProblemsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUploadsResult listUploads(ListUploadsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ScheduleRunResult scheduleRun(ScheduleRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
