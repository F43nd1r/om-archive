
solution {
    puzzle = "P028"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 1 to 1
        positions = listOf(1 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
