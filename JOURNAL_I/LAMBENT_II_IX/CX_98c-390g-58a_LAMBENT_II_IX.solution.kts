
solution {
    puzzle = "P058"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = -4 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -6 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -4 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -1 to 1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 4 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 6 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 3 to 0
        rotation = 4
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -5 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to 1
        rotation = 0
    }
    track {
        position = -4 to -3
        positions = listOf(-2 to 2, -1 to 1, 0 to 0, 1 to -1, 1 to -2, 2 to -3)
    }
    track {
        position = 5 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 3 to -3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
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
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                wait(3)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                back()
                pivotClockwise()
                reset()
                wait(6)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(12)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(8)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                forward()
                wait(1)
                forward()
                pivotCounterClockwise()
                wait(1)
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
