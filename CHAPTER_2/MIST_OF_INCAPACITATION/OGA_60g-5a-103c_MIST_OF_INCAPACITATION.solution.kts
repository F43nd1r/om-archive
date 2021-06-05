
solution {
    puzzle = "P018"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 9
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = 9
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
