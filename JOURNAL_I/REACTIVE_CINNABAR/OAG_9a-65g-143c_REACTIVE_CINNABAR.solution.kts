
solution {
    puzzle = "P056"
    name = "OVERLAP AG"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                forward()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
