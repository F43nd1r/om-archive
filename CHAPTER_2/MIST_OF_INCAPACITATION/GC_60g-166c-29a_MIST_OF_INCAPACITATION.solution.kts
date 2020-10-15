
solution {
    puzzle = "P018"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 3 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 2
        position = 0 to -3
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
