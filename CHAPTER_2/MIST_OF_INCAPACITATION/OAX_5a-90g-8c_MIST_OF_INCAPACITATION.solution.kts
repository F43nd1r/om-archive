
solution {
    puzzle = "P018"
    name = "OC/OAC"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
            }
        }
        )
    }
}
