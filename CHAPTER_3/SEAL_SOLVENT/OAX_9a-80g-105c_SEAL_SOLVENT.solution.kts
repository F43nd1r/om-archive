
solution {
    puzzle = "P026"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to -1
        rotation = 8
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
