
solution {
    puzzle = "P067"
    name = "B F 1-2T"
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
    arm(ARM3) {
        number = 6
        position = 1 to -3
        rotation = 3
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
        position = 1 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 9
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
            sequence(8) {
                wait(4)
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
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(17)
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
            }
        }
        , 
        {
            sequence(2) {
                wait(30)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(26)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
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
                wait(24)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(13)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                wait(5)
                pivotClockwise()
                pivotClockwise()
                reset()
                rotateClockwise()
            }
        }
        )
    }
}
