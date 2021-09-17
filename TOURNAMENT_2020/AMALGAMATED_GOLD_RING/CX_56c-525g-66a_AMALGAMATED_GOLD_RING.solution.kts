
solution {
    puzzle = "w2501727808"
    name = "B CGX 3T"
    arm(ARM1) {
        number = 1
        position = -1 to -7
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to -6
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -6
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -8
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 4 to -7
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 4 to -6
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 5 to -8
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 5 to -7
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 1 to -4
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 4 to -5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 1 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 7 to -4
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 6 to -3
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 7 to -3
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 4 to -4
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 16
        position = 8 to -5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = 6 to -7
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 18
        position = 0 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -4
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 2 to -3
        rotation = -4
    }
    glyph(UNBONDER) {
        position = 3 to -8
        rotation = -4
    }
    glyph(UNBONDER) {
        position = 6 to -5
        rotation = -5
    }
    glyph(PROJECTION) {
        position = 3 to -6
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = 1 to -6
        rotation = -6
    }
    glyph(DISPOSAL) {
        position = 8 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -7
        rotation = -7
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 5 to -5
        rotation = 1
    }
    track {
        position = 0 to -7
        positions = listOf(0 to 0, -1 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 8 to -4
        positions = listOf(-2 to 1, -1 to 1, 0 to 0, -1 to 0)
    }
    track {
        position = 5 to -7
        positions = listOf(0 to 1, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                drop()
                back()
                grab()
                back()
                back()
                drop()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
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
            sequence(3) {
                wait(2)
                back()
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                grab()
                back()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(10) {
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
                wait(2)
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
            sequence(4) {
                wait(2)
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
            sequence(15) {
                wait(7)
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
            sequence(12) {
                wait(3)
                grab()
                back()
                back()
                back()
                drop()
                back()
                grab()
                back()
                back()
                drop()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                back()
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                grab()
                back()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(13)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(17) {
                wait(7)
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
            sequence(16) {
                wait(5)
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
            sequence(7) {
                wait(4)
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
            sequence(8) {
                wait(4)
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
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
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
