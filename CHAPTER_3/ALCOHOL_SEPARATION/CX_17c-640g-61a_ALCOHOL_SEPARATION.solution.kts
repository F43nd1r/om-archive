
solution {
    puzzle = "P024"
    name = "B CX 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 6 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 3 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 2 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 4 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 3 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 4 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 5 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 6 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 7 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 3 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = 2 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = 3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 18
        position = 4 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 19
        position = 5 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 20
        position = 5 to -6
        rotation = 2
        size = 2
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 3 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 6 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 5 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 5 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 2 to 2
        rotation = 0
    }
    track {
        position = 0 to 4
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 2 to 0)
    }
    track {
        position = 3 to 3
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = -1 to 3
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = 1 to -2
        positions = listOf(1 to -1, 2 to -2, 3 to -3, 4 to -4, 4 to -3, 3 to -2, 2 to -1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                rotateClockwise()
                wait(2)
                reset()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(3)
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                forward()
                grab()
                forward()
                drop()
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                forward()
                grab()
                forward()
                forward()
                drop()
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                forward()
                forward()
                grab()
                forward()
                forward()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                forward()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(3)
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                forward()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(20) {
                wait(4)
                forward()
                forward()
                wait(2)
                forward()
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(4)
                forward()
                forward()
                wait(2)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(4)
                forward()
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(4)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                back()
                back()
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                back()
                wait(1)
                back()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                forward()
                forward()
                grab()
                forward()
                drop()
                forward()
                forward()
                grab()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
