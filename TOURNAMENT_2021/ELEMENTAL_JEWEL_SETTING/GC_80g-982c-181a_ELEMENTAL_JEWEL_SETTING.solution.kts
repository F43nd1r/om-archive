
solution {
    puzzle = "w2450512809"
    name = "B"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -2 to 1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -8
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                rotateClockwise()
                wait(11)
                rotateClockwise()
                rotateClockwise()
                wait(13)
                rotateClockwise()
                wait(11)
                rotateClockwise()
                rotateClockwise()
                wait(13)
                rotateClockwise()
                wait(11)
                rotateClockwise()
                rotateClockwise()
                wait(13)
                rotateClockwise()
                wait(11)
                rotateClockwise()
                rotateClockwise()
                wait(13)
                rotateClockwise()
                wait(11)
                rotateClockwise()
                rotateClockwise()
                wait(13)
                rotateClockwise()
                wait(11)
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
