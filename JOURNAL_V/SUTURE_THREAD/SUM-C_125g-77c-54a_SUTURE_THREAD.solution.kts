
solution {
    puzzle = "P085"
    name = "SUM"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
