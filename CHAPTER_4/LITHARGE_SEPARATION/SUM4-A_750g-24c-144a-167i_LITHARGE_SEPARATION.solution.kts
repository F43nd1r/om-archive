
solution {
    puzzle = "P031b"
    name = "CI (Copy)"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -1 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 5 to -3
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 5 to -2
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 7 to -3
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 8 to -4
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 8 to -5
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 6 to -3
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 5 to -4
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 6 to -5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 7 to -5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = 5 to -6
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = 6 to -6
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 18
        position = 7 to -7
        rotation = -4
        size = 2
    }
    arm(ARM6) {
        number = 19
        position = 4 to -5
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 20
        position = 3 to -5
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 21
        position = 4 to -6
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 22
        position = -3 to -3
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 23
        position = 2 to -5
        rotation = 2
        size = 2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    track {
        position = 5 to -4
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = 4 to -4
        positions = listOf(0 to -1, 0 to -2, -1 to -2, -1 to -1)
    }
    track {
        position = 5 to -6
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    track {
        position = -1 to -1
        positions = listOf(0 to -1, 0 to -2, 0 to -3, -1 to -2, -1 to -1)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 3 to -2, 3 to -1, 2 to 0, 1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(16) {
                wait(5)
                grab()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(2)
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                forward()
                forward()
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(18) {
                wait(5)
                drop()
                wait(1)
                forward()
                wait(2)
                forward()
                grab()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(17) {
                wait(7)
                forward()
                grab()
                forward()
                forward()
                drop()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                forward()
                drop()
                wait(1)
                forward()
                wait(1)
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                forward()
                wait(1)
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(14) {
                wait(3)
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(15) {
                wait(4)
                forward()
                wait(1)
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(22) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(23) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(20) {
                wait(7)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                wait(2)
                forward()
            }
        }
        , 
        {
            sequence(19) {
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                wait(2)
                forward()
                forward()
            }
        }
        , 
        {
            sequence(21) {
                wait(6)
                forward()
                wait(2)
                forward()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
