
solution {
    puzzle = "w2450560971"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = 3 to 0
        rotation = -3
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 2 to 1
        rotation = 6
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -4
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 1 to 1
        rotation = -3
    }
    glyph(DISPOSAL) {
        position = 0 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    track {
        position = 3 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0, 7 to 0, 8 to 0, 9 to 0, 10 to 0, 11 to 0, 12 to 0, 13 to 0, 14 to 0, 15 to 0, 16 to 0, 17 to 0, 18 to 0, 19 to 0, 20 to 0, 21 to 0, 22 to 0, 23 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
            }
        }
        )
    }
}
