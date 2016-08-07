$(function() {
    //  morris Area chart on dashboard///
    Morris.Area({
        element: 'morris-area-chart',
        data: [{
            period: '2014 Q1',
            cards: 40000000,
            commissions: 24000000,
            total: 64000000
        }, {
            period: '2014 Q2',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }, {
            period: '2014 Q3',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }, {
            period: '2014 Q4',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }, {
            period: '2015 Q1',
            cards: 45000000,
            commissions: 24000000,
            total: 69000000
        }, {
            period: '2015 Q2',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }, {
            period: '2015 Q3',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }, {
            period: '2015 Q4',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }, {
            period: '2016 Q1',
            cards: 45000000,
            commissions: 24000000,
            total: 69000000
        }, {
            period: '2016 Q2',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }, {
            period: '2016 Q3',
            cards: 0,
            commissions: 24000000,
            total: 24000000
        }],
        xkey: 'period',
        ykeys: ['cards', 'commissions', 'total'],
        labels: ['cards', 'commissions', 'profits'],
        pointSize: 2,
        hideHover: 'auto',
        resize: true
    });
    //  morris donut chart on dashboard///
    Morris.Donut({
        element: 'morris-donut-chart',
        data: [{
            label: "Top-ups",
            value: 12000000
        }, {
            label: "Payments",
            value: 3000000
        }, {
            label: "Balance",
            value: 9000000
        }],
        resize: true
    });

    Morris.Bar({
        element: 'morris-bar-chart',
        data: [{
            y: '2006',
            a: 100,
            b: 90
        }, {
            y: '2007',
            a: 75,
            b: 65
        }, {
            y: '2008',
            a: 50,
            b: 40
        }, {
            y: '2009',
            a: 75,
            b: 65
        }, {
            y: '2010',
            a: 50,
            b: 40
        }, {
            y: '2011',
            a: 75,
            b: 65
        }, {
            y: '2012',
            a: 100,
            b: 90
        }],
        xkey: 'y',
        ykeys: ['a', 'b'],
        labels: ['Series A', 'Series B'],
        hideHover: 'auto',
        resize: true
    });

});
