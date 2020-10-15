
solution {
    puzzle = "P031b"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 3 to 2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 2 to 3
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 3 to 3
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 4 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 0 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 1 to -3
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 0 to -2
        rotation = -6
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = 0 to -3
        rotation = -6
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = -1 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -2 to 0
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 12
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 13
        position = 5 to 1
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 4 to 1
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = 4 to 0
        rotation = -9
        size = 3
    }
    arm(PISTON) {
        number = 16
        position = 0 to 4
        rotation = -8
        size = 2
    }
    arm(PISTON) {
        number = 17
        position = 0 to 5
        rotation = -8
        size = 3
    }
    arm(PISTON) {
        number = 18
        position = 1 to 3
        rotation = -8
        size = 2
    }
    arm(PISTON) {
        number = 19
        position = -1 to 3
        rotation = -7
        size = 2
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = -7
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = -7
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = -6
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 7 to -2
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 2 to 3
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = 5 to 1
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, -1 to 0)
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                wait(1)
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                grab()
                rotateClockwise()
                back()
                wait(1)
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                reset()
                wait(9)
                forward()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                back()
                wait(2)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                wait(1)
                rotateClockwise()
                back()
                drop()
                wait(1)
                back()
                wait(2)
                back()
                wait(2)
                reset()
                wait(9)
                forward()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                wait(1)
                rotateClockwise()
                back()
                drop()
                wait(1)
                back()
                wait(2)
                back()
                wait(2)
                back()
                wait(2)
                reset()
                wait(9)
                forward()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(3)
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                grab()
                rotateClockwise()
                wait(10)
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                back()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                back()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                forward()
                wait(11)
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(7)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                back()
                wait(2)
                back()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                back()
                wait(1)
                grab()
                back()
                extend()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                grab()
                extend()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                back()
                drop()
                wait(1)
                reset()
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                back()
                back()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                back()
                grab()
                back()
                back()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(4)
                back()
                back()
                rotateClockwise()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                rotateClockwise()
                wait(1)
                forward()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                back()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                back()
                wait(1)
                forward()
                wait(12)
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(8)
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(19) {
                wait(8)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(9)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(8)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(5)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(16)
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                grab()
                rotateClockwise()
                back()
                back()
                reset()
                repeat()
                wait(15)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                back()
                grab()
                rotateClockwise()
                back()
                wait(1)
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                grab()
                rotateClockwise()
                back()
                wait(1)
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                wait(8)
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
