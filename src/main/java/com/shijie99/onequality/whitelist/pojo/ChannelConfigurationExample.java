package com.shijie99.onequality.whitelist.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelConfigurationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelConfigurationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChanneltypeIsNull() {
            addCriterion("channeltype is null");
            return (Criteria) this;
        }

        public Criteria andChanneltypeIsNotNull() {
            addCriterion("channeltype is not null");
            return (Criteria) this;
        }

        public Criteria andChanneltypeEqualTo(String value) {
            addCriterion("channeltype =", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotEqualTo(String value) {
            addCriterion("channeltype <>", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeGreaterThan(String value) {
            addCriterion("channeltype >", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeGreaterThanOrEqualTo(String value) {
            addCriterion("channeltype >=", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeLessThan(String value) {
            addCriterion("channeltype <", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeLessThanOrEqualTo(String value) {
            addCriterion("channeltype <=", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeLike(String value) {
            addCriterion("channeltype like", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotLike(String value) {
            addCriterion("channeltype not like", value, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeIn(List<String> values) {
            addCriterion("channeltype in", values, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotIn(List<String> values) {
            addCriterion("channeltype not in", values, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeBetween(String value1, String value2) {
            addCriterion("channeltype between", value1, value2, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChanneltypeNotBetween(String value1, String value2) {
            addCriterion("channeltype not between", value1, value2, "channeltype");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNull() {
            addCriterion("channelname is null");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNotNull() {
            addCriterion("channelname is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnameEqualTo(String value) {
            addCriterion("channelname =", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotEqualTo(String value) {
            addCriterion("channelname <>", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThan(String value) {
            addCriterion("channelname >", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("channelname >=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThan(String value) {
            addCriterion("channelname <", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThanOrEqualTo(String value) {
            addCriterion("channelname <=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLike(String value) {
            addCriterion("channelname like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotLike(String value) {
            addCriterion("channelname not like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIn(List<String> values) {
            addCriterion("channelname in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotIn(List<String> values) {
            addCriterion("channelname not in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameBetween(String value1, String value2) {
            addCriterion("channelname between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotBetween(String value1, String value2) {
            addCriterion("channelname not between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelcidIsNull() {
            addCriterion("channelcid is null");
            return (Criteria) this;
        }

        public Criteria andChannelcidIsNotNull() {
            addCriterion("channelcid is not null");
            return (Criteria) this;
        }

        public Criteria andChannelcidEqualTo(String value) {
            addCriterion("channelcid =", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidNotEqualTo(String value) {
            addCriterion("channelcid <>", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidGreaterThan(String value) {
            addCriterion("channelcid >", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidGreaterThanOrEqualTo(String value) {
            addCriterion("channelcid >=", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidLessThan(String value) {
            addCriterion("channelcid <", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidLessThanOrEqualTo(String value) {
            addCriterion("channelcid <=", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidLike(String value) {
            addCriterion("channelcid like", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidNotLike(String value) {
            addCriterion("channelcid not like", value, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidIn(List<String> values) {
            addCriterion("channelcid in", values, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidNotIn(List<String> values) {
            addCriterion("channelcid not in", values, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidBetween(String value1, String value2) {
            addCriterion("channelcid between", value1, value2, "channelcid");
            return (Criteria) this;
        }

        public Criteria andChannelcidNotBetween(String value1, String value2) {
            addCriterion("channelcid not between", value1, value2, "channelcid");
            return (Criteria) this;
        }

        public Criteria andDbnameIsNull() {
            addCriterion("dbname is null");
            return (Criteria) this;
        }

        public Criteria andDbnameIsNotNull() {
            addCriterion("dbname is not null");
            return (Criteria) this;
        }

        public Criteria andDbnameEqualTo(String value) {
            addCriterion("dbname =", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotEqualTo(String value) {
            addCriterion("dbname <>", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameGreaterThan(String value) {
            addCriterion("dbname >", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameGreaterThanOrEqualTo(String value) {
            addCriterion("dbname >=", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLessThan(String value) {
            addCriterion("dbname <", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLessThanOrEqualTo(String value) {
            addCriterion("dbname <=", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLike(String value) {
            addCriterion("dbname like", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotLike(String value) {
            addCriterion("dbname not like", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameIn(List<String> values) {
            addCriterion("dbname in", values, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotIn(List<String> values) {
            addCriterion("dbname not in", values, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameBetween(String value1, String value2) {
            addCriterion("dbname between", value1, value2, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotBetween(String value1, String value2) {
            addCriterion("dbname not between", value1, value2, "dbname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andWhiteurlIsNull() {
            addCriterion("whiteurl is null");
            return (Criteria) this;
        }

        public Criteria andWhiteurlIsNotNull() {
            addCriterion("whiteurl is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteurlEqualTo(String value) {
            addCriterion("whiteurl =", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlNotEqualTo(String value) {
            addCriterion("whiteurl <>", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlGreaterThan(String value) {
            addCriterion("whiteurl >", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlGreaterThanOrEqualTo(String value) {
            addCriterion("whiteurl >=", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlLessThan(String value) {
            addCriterion("whiteurl <", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlLessThanOrEqualTo(String value) {
            addCriterion("whiteurl <=", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlLike(String value) {
            addCriterion("whiteurl like", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlNotLike(String value) {
            addCriterion("whiteurl not like", value, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlIn(List<String> values) {
            addCriterion("whiteurl in", values, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlNotIn(List<String> values) {
            addCriterion("whiteurl not in", values, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlBetween(String value1, String value2) {
            addCriterion("whiteurl between", value1, value2, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andWhiteurlNotBetween(String value1, String value2) {
            addCriterion("whiteurl not between", value1, value2, "whiteurl");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}