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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeMetricCollectionTypesResult implements Serializable, Cloneable {

    /**
     * One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     * <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     * <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     * <li><p>GroupStandbyInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     * returned by default. You must explicitly request it when calling
     * <a>EnableMetricsCollection</a>. </note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType> metrics;

    /**
     * The granularities for the listed metrics.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType> granularities;

    /**
     * One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     * <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     * <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     * <li><p>GroupStandbyInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     * returned by default. You must explicitly request it when calling
     * <a>EnableMetricsCollection</a>. </note>
     *
     * @return One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     *         <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     *         <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     *         <li><p>GroupStandbyInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     *         returned by default. You must explicitly request it when calling
     *         <a>EnableMetricsCollection</a>. </note>
     */
    public java.util.List<MetricCollectionType> getMetrics() {
        if (metrics == null) {
              metrics = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType>();
              metrics.setAutoConstruct(true);
        }
        return metrics;
    }
    
    /**
     * One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     * <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     * <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     * <li><p>GroupStandbyInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     * returned by default. You must explicitly request it when calling
     * <a>EnableMetricsCollection</a>. </note>
     *
     * @param metrics One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     *         <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     *         <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     *         <li><p>GroupStandbyInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     *         returned by default. You must explicitly request it when calling
     *         <a>EnableMetricsCollection</a>. </note>
     */
    public void setMetrics(java.util.Collection<MetricCollectionType> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType>(metrics.size());
        metricsCopy.addAll(metrics);
        this.metrics = metricsCopy;
    }
    
    /**
     * One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     * <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     * <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     * <li><p>GroupStandbyInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     * returned by default. You must explicitly request it when calling
     * <a>EnableMetricsCollection</a>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     *         <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     *         <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     *         <li><p>GroupStandbyInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     *         returned by default. You must explicitly request it when calling
     *         <a>EnableMetricsCollection</a>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMetricCollectionTypesResult withMetrics(MetricCollectionType... metrics) {
        if (getMetrics() == null) setMetrics(new java.util.ArrayList<MetricCollectionType>(metrics.length));
        for (MetricCollectionType value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     * <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     * <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     * <li><p>GroupStandbyInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     * returned by default. You must explicitly request it when calling
     * <a>EnableMetricsCollection</a>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics One or more of the following metrics: <ul> <li><p>GroupMinSize</li>
     *         <li><p>GroupMaxSize</li> <li><p>GroupDesiredCapacity</li>
     *         <li><p>GroupInServiceInstances</li> <li><p>GroupPendingInstances</li>
     *         <li><p>GroupStandbyInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul> <note> <p>The <code>GroupStandbyInstances</code> metric is not
     *         returned by default. You must explicitly request it when calling
     *         <a>EnableMetricsCollection</a>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMetricCollectionTypesResult withMetrics(java.util.Collection<MetricCollectionType> metrics) {
        if (metrics == null) {
            this.metrics = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType>(metrics.size());
            metricsCopy.addAll(metrics);
            this.metrics = metricsCopy;
        }

        return this;
    }

    /**
     * The granularities for the listed metrics.
     *
     * @return The granularities for the listed metrics.
     */
    public java.util.List<MetricGranularityType> getGranularities() {
        if (granularities == null) {
              granularities = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType>();
              granularities.setAutoConstruct(true);
        }
        return granularities;
    }
    
    /**
     * The granularities for the listed metrics.
     *
     * @param granularities The granularities for the listed metrics.
     */
    public void setGranularities(java.util.Collection<MetricGranularityType> granularities) {
        if (granularities == null) {
            this.granularities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType> granularitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType>(granularities.size());
        granularitiesCopy.addAll(granularities);
        this.granularities = granularitiesCopy;
    }
    
    /**
     * The granularities for the listed metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param granularities The granularities for the listed metrics.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMetricCollectionTypesResult withGranularities(MetricGranularityType... granularities) {
        if (getGranularities() == null) setGranularities(new java.util.ArrayList<MetricGranularityType>(granularities.length));
        for (MetricGranularityType value : granularities) {
            getGranularities().add(value);
        }
        return this;
    }
    
    /**
     * The granularities for the listed metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param granularities The granularities for the listed metrics.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMetricCollectionTypesResult withGranularities(java.util.Collection<MetricGranularityType> granularities) {
        if (granularities == null) {
            this.granularities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType> granularitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType>(granularities.size());
            granularitiesCopy.addAll(granularities);
            this.granularities = granularitiesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetrics() != null) sb.append("Metrics: " + getMetrics() + ",");
        if (getGranularities() != null) sb.append("Granularities: " + getGranularities() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode()); 
        hashCode = prime * hashCode + ((getGranularities() == null) ? 0 : getGranularities().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMetricCollectionTypesResult == false) return false;
        DescribeMetricCollectionTypesResult other = (DescribeMetricCollectionTypesResult)obj;
        
        if (other.getMetrics() == null ^ this.getMetrics() == null) return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false) return false; 
        if (other.getGranularities() == null ^ this.getGranularities() == null) return false;
        if (other.getGranularities() != null && other.getGranularities().equals(this.getGranularities()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeMetricCollectionTypesResult clone() {
        try {
            return (DescribeMetricCollectionTypesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    