
solution {
    puzzle = "P018"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to 1
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 2
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
