const USER_KEY = 'user-store';

export const getAccessToken = () => {
    const res = JSON.parse(localStorage.getItem(USER_KEY) || '');
    return res.state.accessToken;
};

export const getRefreshToken = () => {
    const res = JSON.parse(localStorage.getItem(USER_KEY) || '');
    return res.state.refreshToken;
};