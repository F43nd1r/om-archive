
solution {
    puzzle = "w2501727808"
    name = "B CI131"
    arm(ARM1) {
        number = 1
        position = -1 to -7
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to -6
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -5
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -4
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 4 to -8
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 4 to -7
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 4 to -6
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 5 to -8
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 5 to -7
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 1 to -4
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 11
        position = 0 to -3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 6 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 4 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 8 to -5
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 7 to -5
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = 1 to -3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = 3 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 18
        position = 3 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 19
        position = 7 to -1
        rotation = 9
        size = 2
    }
    arm(ARM6) {
        number = 20
        position = 0 to -2
        rotation = 6
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -8
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 3 to -6
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 1 to -6
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -7
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to -2
        rotation = 4
    }
    track {
        position = 0 to -5
        positions = listOf(0 to 0, -1 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 0 to -7
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    track {
        position = 7 to -4
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 5 to -4
        positions = listOf(0 to 0, 1 to -1, 0 to -1, -1 to 0)
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
                drop()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
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
            sequence(5) {
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
            sequence(3) {
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                back()
                wait(1)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                grab()
                back()
                back()
                drop()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(7)
                back()
                wait(1)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(3)
                grab()
                back()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                back()
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(7)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
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
            }
        }
        , 
        {
            sequence(20) {
                wait(13)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(16) {
                wait(10)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                back()
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                back()
                reset()
                wait(1)
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
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                repeat()
            }
        }
        )
    }
}
