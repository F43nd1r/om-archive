
solution {
    puzzle = "P024"
    name = "CI (Copy)"
    arm(ARM3) {
        number = 1
        position = -9 to -3
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -10 to -3
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = -11 to 1
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -13 to 2
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 5
        position = -14 to 2
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 6
        position = -12 to 1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -10 to -4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = -11 to -4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = -3 to -4
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 10
        position = -1 to -3
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 11
        position = -3 to -2
        rotation = -3
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 12
        position = -10 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 13
        position = -10 to 5
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 14
        position = -10 to 4
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 15
        position = -5 to 2
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 16
        position = -5 to 3
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 17
        position = -4 to 2
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 18
        position = -4 to 3
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 19
        position = -9 to -6
        rotation = 0
        size = 2
    }
    glyph(UNBONDER) {
        position = -7 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -10 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -8 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -8 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to -2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -9 to -2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -10 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -8 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -8 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -13 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -7 to -8
        rotation = 0
    }
    track {
        position = -10 to 5
        positions = listOf(0 to 0, 0 to -1, -1 to 0)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = -4 to 2
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = -11 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 1, -2 to 1, -1 to 1)
    }
    track {
        position = -9 to -3
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = -10 to -5
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(12) {
                wait(5)
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
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
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                grab()
                forward()
                rotateClockwise()
                drop()
                wait(1)
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
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
                wait(1)
                forward()
                forward()
            }
        }
        , 
        {
            sequence(16) {
                wait(6)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(6)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(17) {
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                forward()
                drop()
                forward()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(19) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                rotateClockwise()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        )
    }
}
