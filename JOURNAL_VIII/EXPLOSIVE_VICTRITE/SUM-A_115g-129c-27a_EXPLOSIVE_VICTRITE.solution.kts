
solution {
    puzzle = "P100"
    name = "B S 6T"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1, 1 to 1)
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
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(6)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
