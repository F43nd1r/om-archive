
solution {
    puzzle = "P086"
    name = "WIDTH"
    arm(ARM1) {
        number = 1
        position = -8 to -9
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -9 to -8
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to -8
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -9 to -7
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -9 to -9
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -7 to -5
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -8 to -6
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -5 to -7
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -4 to -6
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = -6 to -4
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -2 to -5
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = -4 to -2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 13
        position = -4 to -3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 14
        position = 3 to 0
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -6 to -7
        rotation = -3
    }
    glyph(BONDER) {
        position = -5 to -6
        rotation = -3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = -6 to -9
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -8 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = -8 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to -7
        rotation = 0
    }
    track {
        position = -3 to -6
        positions = listOf(-1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = -4 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -9 to -9
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 3 to 0
        positions = listOf(0 to 0, 0 to 1, 0 to 2)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(10)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                extend()
                reset()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(8)
                repeat()
                wait(7)
                extendTape()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(11)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(14)
                grab()
                extend()
                extend()
                reset()
                wait(9)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(17)
                grab()
                extend()
                reset()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(19)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(9)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(22)
                back()
                grab()
                forward()
                reset()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                grab()
                forward()
                forward()
                reset()
                wait(9)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                retract()
                reset()
                wait(10)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                forward()
                wait(3)
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(46)
                grab()
                forward()
                retract()
                forward()
                reset()
            }
        }
        )
    }
}
