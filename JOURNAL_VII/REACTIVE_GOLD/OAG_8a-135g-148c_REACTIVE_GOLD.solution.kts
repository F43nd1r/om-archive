
solution {
    puzzle = "P095"
    name = "OAC"
    arm(PISTON) {
        number = 1
        position = 1 to -1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 1 to -1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 2 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 2
    }
    track {
        position = 2 to 0
        positions = listOf(-1 to -1, -1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
            }
        }
        )
    }
}
