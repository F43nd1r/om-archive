
solution {
    puzzle = "P019"
    name = "OVERLAP AREA"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
