
solution {
    puzzle = "P031b"
    name = "B CX 7T"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 0
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -4 to 1
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -1 to -7
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -1 to -6
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -1 to -5
        rotation = -5
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = -5 to -1
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 2 to 0
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 1 to 0
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 1 to -1
        rotation = -9
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = -4 to 2
        rotation = -7
        size = 1
    }
    arm(PISTON) {
        number = 15
        position = -3 to -1
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = -2 to 2
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = -2 to 3
        rotation = -8
        size = 2
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -7
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = -7
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = 4 to -3
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 1 to -1)
    }
    track {
        position = 2 to 0
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, -1 to 0)
    }
    track {
        position = -1 to -6
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -1 to 1, -2 to 1, -1 to 0, 0 to -1)
    }
    tape {
        parallel(
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
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
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
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                back()
                back()
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
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                repeat()
                wait(9)
                back()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(7)
                back()
                grab()
                back()
                back()
                drop()
                back()
                repeat()
                wait(5)
                repeat()
                wait(8)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                repeat()
                wait(9)
                back()
                wait(2)
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
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                reset()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                back()
                wait(21)
                forward()
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                back()
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                reset()
                back()
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(8)
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
            sequence(7) {
                wait(4)
                grab()
                back()
                back()
                back()
                back()
                drop()
                reset()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                drop()
                back()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                wait(2)
                back()
                forward()
                wait(13)
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(8)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                retract()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
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
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                grab()
                back()
                back()
                drop()
                back()
                back()
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                reset()
            }
        }
        )
    }
}
