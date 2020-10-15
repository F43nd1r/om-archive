
solution {
    puzzle = "P058"
    name = "B S 1 2T"
    arm(ARM1) {
        number = 1
        position = -5 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -7
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -6 to -4
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 2 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 1 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 5 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 3 to -4
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -3 to -5
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 3 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -7
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -5 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -2
        rotation = 0
    }
    track {
        position = -5 to -5
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 3 to -3, 3 to -4)
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = 2 to -4
        positions = listOf(1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                forward()
                forward()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                wait(3)
                pivotClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                back()
                grab()
                forward()
                drop()
                wait(2)
                back()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                back()
                pivotClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                back()
                pivotClockwise()
                drop()
                back()
                wait(4)
                back()
                grab()
                forward()
                drop()
                wait(2)
                back()
                grab()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateClockwise()
                reset()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        )
    }
}
