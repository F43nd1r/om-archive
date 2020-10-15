
solution {
    puzzle = "P024"
    name = "B CG 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to -4
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -3 to 1
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -4 to 0
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 5 to -8
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 4 to -8
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -1 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -2 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 6 to -5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 13
        position = 6 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 8 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = 4 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 5 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = 3 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 18
        position = 6 to 1
        rotation = 3
        size = 3
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -3
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -7
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -2 to 1, -1 to 1)
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -1 to -1, 0 to -1)
    }
    track {
        position = 4 to -7
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -2 to 4
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = 5 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(5)
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
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
            sequence(8) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
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
            sequence(14) {
                wait(5)
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
            sequence(3) {
                wait(3)
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(7)
                forward()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(17) {
                wait(8)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(18) {
                wait(8)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
