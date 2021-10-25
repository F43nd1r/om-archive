
solution {
    puzzle = "P063"
    name = "FORGOT I HAD THIS ONE 387"
    arm(ARM1) {
        number = 1
        position = -4 to 1
        rotation = -8
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to 3
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = -10
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to -3
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                back()
                rotateCounterClockwise()
                wait(2)
                forward()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                forward()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                forward()
                back()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                drop()
                forward()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(3)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                rotateClockwise()
            }
        }
        )
    }
}
