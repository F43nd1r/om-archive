
solution {
    puzzle = "w2501727721"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 2 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 6 to 0
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 6 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 5 to 0
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to 5
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 8 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 7 to 2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -2 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -1 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -1 to 3
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -2 to 4
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -3 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 2 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 1 to -1
        rotation = 1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 5 to 4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 4 to 3
        rotation = -1
    }
    track {
        position = -2 to 3
        positions = listOf(-1 to 0, 0 to -1, 0 to 0, 1 to -1, 1 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = 2 to 4
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 7 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 5 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
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
            sequence(14) {
                wait(4)
                grab()
                rotateCounterClockwise()
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
            sequence(15) {
                wait(4)
                grab()
                rotateCounterClockwise()
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
            sequence(13) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                wait(1)
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                wait(2)
                grab()
                back()
                rotateClockwise()
                wait(2)
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                back()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                wait(2)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                back()
                wait(3)
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                wait(2)
                grab()
                back()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
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
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                wait(2)
                grab()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
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
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                reset()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                back()
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
                wait(1)
                forward()
                grab()
                back()
                reset()
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
        )
    }
}
