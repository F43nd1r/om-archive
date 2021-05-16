
solution {
    puzzle = "P101"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -6 to 5
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -4 to 5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 4
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to 4
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -5 to 4
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 5
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                wait(7)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(20)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(3)
                grab()
                back()
                wait(1)
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                reset()
            }
        }
        )
    }
}
