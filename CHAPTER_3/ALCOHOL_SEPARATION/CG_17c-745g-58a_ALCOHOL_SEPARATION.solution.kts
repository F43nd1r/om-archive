
solution {
    puzzle = "P024"
    name = "B CA 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 5 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 1 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 0 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -2 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 0 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 2 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 3 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 4 to 2
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 14
        position = 4 to -3
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = 5 to -4
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 16
        position = 5 to -3
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 17
        position = 5 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 18
        position = 1 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 19
        position = 1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 20
        position = 2 to -4
        rotation = 2
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 2 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 5 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 4 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 1 to 2
        rotation = 0
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -1 to 4
        positions = listOf(0 to 0, 1 to -1, 2 to -1)
    }
    track {
        position = 2 to 3
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = -2 to -1
        positions = listOf(2 to -1, 1 to 0, 0 to 0, 1 to -1, 2 to -2, 3 to -3, 2 to -3, 1 to -2)
    }
    track {
        position = 0 to -1
        positions = listOf(1 to -1, 2 to -2, 3 to -3, 2 to -3, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
            sequence(5) {
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
            sequence(17) {
                wait(6)
                grab()
                retract()
                reset()
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
                forward()
                forward()
                grab()
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                repeat()
                wait(3)
                repeat()
                wait(9)
                extendTape()
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
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                forward()
                grab()
                retract()
                retract()
                forward()
                drop()
                extend()
                extend()
                reset()
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
                forward()
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
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                forward()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(3) {
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
            sequence(4) {
                wait(7)
                back()
                grab()
                forward()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                forward()
                wait(3)
                forward()
                grab()
                retract()
                retract()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(5)
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(20) {
                wait(8)
                forward()
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(1)
                back()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                back()
                wait(2)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(7)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(2)
                grab()
                retract()
                retract()
                forward()
                drop()
                extend()
                extend()
                forward()
                wait(3)
                reset()
            }
        }
        )
    }
}
