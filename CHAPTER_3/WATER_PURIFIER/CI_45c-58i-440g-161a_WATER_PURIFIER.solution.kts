
solution {
    puzzle = "P025"
    name = "CI (Copy)"
    arm(ARM1) {
        number = 1
        position = -3 to -1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 3
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -2 to -2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -4 to -3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -1 to 2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -1 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -3 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 2 to -8
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -1 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 5 to -7
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 5 to -3
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 2 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = 0
    }
    track {
        position = -1 to -6
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 3 to -3)
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -4 to -3
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(39)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(41)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                forward()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
        
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
