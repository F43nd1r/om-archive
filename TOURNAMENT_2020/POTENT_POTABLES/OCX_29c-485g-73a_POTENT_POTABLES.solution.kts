
solution {
    puzzle = "w2501727721"
    name = "B CX 2T"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to 2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 6 to -2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 5 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 6 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -3 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -4 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -6 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -5 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = -1 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = -2 to -3
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -4
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 0
        rotation = -1
    }
    track {
        position = -3 to -4
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = -6 to 2
        positions = listOf(1 to -1, 0 to 0, 0 to -1)
    }
    track {
        position = -1 to -4
        positions = listOf(-1 to 1, -1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = 5 to -1
        positions = listOf(1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = 2 to -3
        positions = listOf(1 to 0, 0 to 1, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
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
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
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
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(4)
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(7)
                back()
                grab()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                back()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(7)
                back()
                grab()
                back()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
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
            sequence(7) {
                wait(4)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                back()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                back()
                grab()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
