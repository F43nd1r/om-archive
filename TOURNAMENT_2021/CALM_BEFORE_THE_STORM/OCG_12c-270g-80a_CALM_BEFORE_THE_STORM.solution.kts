
solution {
    puzzle = "w2450512434"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to -2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 6
    }
    io(INFINITE) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = -10 to -2
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0, 7 to 0, 8 to 0, 9 to 0, 10 to 0, 11 to 0)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0, -6 to 0, -7 to 0, -8 to 0, -9 to 0, -10 to 0, -11 to 0)
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
            }
        }
        , 
        {
            sequence(2) {
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
            }
        }
        )
    }
}
