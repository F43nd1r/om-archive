
solution {
    puzzle = "P067"
    name = "663"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -6 to 4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 4 to -3
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 0 to 1
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -7 to 5
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to 7
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -3 to 3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 4
    }
    io(INFINITE) {
        index = 0
        position = -4 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 13
    }
    io(INPUT) {
        index = 1
        position = 6 to -4
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 1
        rotation = -3
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -2 to 5
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(6)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(15)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(29)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(11)
                grab()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(25)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(22)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(6)
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
